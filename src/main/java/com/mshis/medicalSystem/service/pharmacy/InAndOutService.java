package com.mshis.medicalSystem.service.pharmacy;

import com.mshis.medicalSystem.dao.pharmacy.Uh03OnStoreDao;
import com.mshis.medicalSystem.dao.pharmacy.Uh03StoreInDao;
import com.mshis.medicalSystem.dao.pharmacy.Uh03StoreOutDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03OnStore;
import com.mshis.medicalSystem.pojo.bean.Uh03StoreIn;
import com.mshis.medicalSystem.pojo.bean.Uh03StoreOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * description: in/out
 * author: 小白
 * create: 2019-07-18 10:18
 */

@Service
@Transactional
public class InAndOutService {

    @Autowired
    private Uh03StoreInDao uh03StoreInDao;   //入库

    @Autowired
    private Uh03StoreOutDao uh03StoreOutDao; //出库

    @Autowired
    private Uh03OnStoreDao uh03OnStoreDao;//在库

    public Result in(Uh03StoreIn uh03StoreIn) {
        uh03StoreInDao.save(uh03StoreIn);//添加入库登记表
        List<Uh03OnStore> onStoreAll = uh03OnStoreDao.findAll();
        boolean flag=false;
        for (Uh03OnStore uh03OnStore : onStoreAll) {
            if(uh03OnStore.getMediNo().equals(uh03StoreIn.getMediNo())){//判断在库表中是否有入库药品
                flag=true;
            }
        }
        if(flag){
            uh03OnStoreDao.saveNum(uh03StoreIn.getQuantity(),uh03StoreIn.getMediNo());  //更新在库表
        }else{
            Uh03OnStore uh03OnStore=new Uh03OnStore(uh03StoreIn.getMediNo(),uh03StoreIn.getSpecification(),uh03StoreIn.getUnit(),uh03StoreIn.getUnitPrice(),uh03StoreIn.getQuantity());
            uh03OnStoreDao.save(uh03OnStore);//添加入库
        }
        return new Result(Code.OK,"入库成功");
    }

    public Result out(Uh03StoreOut uh03StoreOut){
        List<Uh03OnStore> onStoreAll = uh03OnStoreDao.findAll();
        for (Uh03OnStore uh03OnStore : onStoreAll) {
            if(uh03OnStore.getQuantity()>=uh03StoreOut.getQuantity()){//判断在库表中药品数量是否大于出库药品数量
                uh03StoreOutDao.save(uh03StoreOut);//编写出库明细表
                uh03OnStoreDao.saveNum2(uh03StoreOut.getQuantity(),uh03StoreOut.getMediNo());//更新在库表
            }
        }
        return new Result(Code.OK,"出库成功");
    }

    public Result queryIn() {
        return new Result(Code.OK,"查询成功",uh03StoreInDao.findAll());
    }

    public Result queryOut() {
        return new Result(Code.OK,"查询成功",uh03StoreOutDao.findAll());
    }
}
