package com.mshis.medicalSystem.service.pharmacy;

import com.mshis.medicalSystem.dao.pharmacy.Uh03CompanyListDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03CompanyList;
import com.mshis.medicalSystem.pojo.bean.Uh03Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Service
public class SupplierService {

    @Autowired
    private Uh03CompanyListDao uh03CompanyListDao;


    public Result query() {
        return new Result(Code.OK,"查询成功",uh03CompanyListDao.findAll());
    }


    public Result add(Uh03CompanyList uh03CompanyList) {
        uh03CompanyListDao.save(uh03CompanyList);
        return new Result(Code.OK,"添加成功");
    }

    public Result delete(Integer id) {
        uh03CompanyListDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result update(Uh03CompanyList uh03CompanyList) {
        uh03CompanyListDao.save(uh03CompanyList);
        return new Result(Code.OK,"修改成功");
    }
}
