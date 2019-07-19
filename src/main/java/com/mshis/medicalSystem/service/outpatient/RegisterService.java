package com.mshis.medicalSystem.service.outpatient;

import com.mshis.medicalSystem.dao.outpatient.RegisterDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Service
public class RegisterService {
    @Autowired
    private RegisterDao registerDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",registerDao.findAll());
    }

    public Result add(Register register) {
        registerDao.save(register);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        registerDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
