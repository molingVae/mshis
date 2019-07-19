package com.mshis.medicalSystem.service.pharmacy;

import com.mshis.medicalSystem.dao.pharmacy.Uh03PriceDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:调价
 * author: 小白
 * create: 2019-07-18 10:18
 */
@Service
public class PharmacyPriceService {

    @Autowired
    private Uh03PriceDao uh03PriceDao;


    public Result query() {
        return new Result(Code.OK,"查询成功",uh03PriceDao.findAll());
    }


    public Result add(Uh03Price uh03Price) {
        uh03PriceDao.save(uh03Price);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        uh03PriceDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
