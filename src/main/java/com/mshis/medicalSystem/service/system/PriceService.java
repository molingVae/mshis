package com.mshis.medicalSystem.service.system;

import com.mshis.medicalSystem.dao.system.PriceDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.ChargeType;
import com.mshis.medicalSystem.pojo.bean.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:31
 */
@Service
public class PriceService {

    @Autowired
    private PriceDao priceDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",priceDao.findAll());
    }


    public Result add(ChargeType chargeType) {
        priceDao.save(chargeType);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        priceDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result update(ChargeType chargeType) {
        priceDao.save(chargeType);
        return new Result(Code.OK,"更新成功");
    }
}
