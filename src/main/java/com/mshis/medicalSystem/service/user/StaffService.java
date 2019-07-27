package com.mshis.medicalSystem.service.user;

import com.mshis.medicalSystem.dao.user.StaffDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.PersonBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 10:18
 */
@Service
public class StaffService {

    @Autowired
    private StaffDao staffDao;


    public Result query() {
        return new Result(Code.OK,"查询成功",staffDao.findAll());

    }


    public Result add(PersonBase personBase) {
        staffDao.save(personBase);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        staffDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
