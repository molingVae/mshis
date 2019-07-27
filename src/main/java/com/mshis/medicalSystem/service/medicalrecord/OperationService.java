package com.mshis.medicalSystem.service.medicalrecord;

import com.mshis.medicalSystem.dao.medicalrecord.OperationDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.PageInfo;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    public Result query(Operation operation, int page, int size) {
        Pageable pageable = new PageRequest(page - 1, size);
        Page<Operation> operationPage = operationDao.findAllByOperationNumAndOperationTimes(
                operation.getOperationNum(), operation.getOperationTimes(), pageable);
        return new Result(Code.OK, "查询成功", new PageInfo(operationPage.getTotalElements(), operationPage.getContent()));
    }

    public Result add(Operation operation) {
        operationDao.save(operation);
        return new Result(Code.OK, "添加成功");
    }

    public Result delete(Integer id) {
        operationDao.deleteById(id);
        return new Result(Code.OK, "删除成功");
    }
}
