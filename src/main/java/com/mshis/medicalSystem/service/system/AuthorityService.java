package com.mshis.medicalSystem.service.system;

import com.mshis.medicalSystem.dao.system.AuthorityDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:09
 */
@Service
public class AuthorityService {

    @Autowired
    private AuthorityDao authorityDao;

    public Result query() {
        return new Result(Code.OK,"查询成功",authorityDao.findAll());
    }


    public Result add(UserAuth userAuth) {
        authorityDao.save(userAuth);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        authorityDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result update(UserAuth userAuth) {
        authorityDao.save(userAuth);
        return new Result(Code.OK,"更新成功");
    }

}
