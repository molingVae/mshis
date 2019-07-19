package com.mshis.medicalSystem.service.system;

import com.mshis.medicalSystem.dao.system.ParameterDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Paraments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:17
 */
@Service
public class ParameterService {

    @Autowired
    private ParameterDao parameterDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",parameterDao.findAll());
    }


    public Result add(Paraments paraments) {
        parameterDao.save(paraments);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        parameterDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result update(Paraments paraments) {
        parameterDao.save(paraments);
        return new Result(Code.OK,"更新成功");
    }
}
