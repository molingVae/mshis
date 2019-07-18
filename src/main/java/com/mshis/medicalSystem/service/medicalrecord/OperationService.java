package com.mshis.medicalSystem.service.medicalrecord;

import com.mshis.medicalSystem.dao.medicalrecord.OperationDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 9:58
 */
@Service
public class OperationService {

    @Autowired
    private OperationDao operationDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",operationDao.findAll());
    }


    public Result add(Operation operation) {
        operationDao.save(operation);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        operationDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
