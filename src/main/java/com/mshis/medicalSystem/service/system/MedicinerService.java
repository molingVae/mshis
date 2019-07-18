package com.mshis.medicalSystem.service.system;

import com.mshis.medicalSystem.dao.system.MedicinerDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:23
 */
@Service
public class MedicinerService {

    @Autowired
    private MedicinerDao medicinerDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",medicinerDao.findAll());
    }


    public Result add(Persons persons) {
        medicinerDao.save(persons);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        medicinerDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result update(Persons persons) {
        medicinerDao.save(persons);
        return new Result(Code.OK,"更新成功");
    }
}
