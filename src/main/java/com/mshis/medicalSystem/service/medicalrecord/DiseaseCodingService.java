package com.mshis.medicalSystem.service.medicalrecord;

import com.mshis.medicalSystem.dao.medicalrecord.DiseaseCodingDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Diagnose;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 9:13
 */
@Service
public class DiseaseCodingService {

    @Autowired
    private DiseaseCodingDao diseaseCodingDao;


    public Result query() {
        return new Result(Code.OK,"查询成功",diseaseCodingDao.findAll());
    }


    public Result add(Diagnose diagnose) {
        diseaseCodingDao.save(diagnose);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        diseaseCodingDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
