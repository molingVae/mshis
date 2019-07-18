package com.mshis.medicalSystem.service.user;

import com.mshis.medicalSystem.dao.user.ContactDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.FamilyMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 10:25
 */
@Service
public class ContactService {

    @Autowired
    private ContactDao contactDao;


    public Result query() {
        return new Result(Code.OK,"查询成功",contactDao.findAll());
    }


    public Result add(FamilyMember familyMember) {
        contactDao.save(familyMember);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        contactDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
