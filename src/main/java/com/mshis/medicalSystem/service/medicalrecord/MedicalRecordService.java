package com.mshis.medicalSystem.service.medicalrecord;

import com.mshis.medicalSystem.dao.medicalrecord.MedicalRecordDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.FirstPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 9:50
 */
@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordDao medicalRecordDao;


    public Result query() {
        return new Result(Code.OK,"查询成功",medicalRecordDao.findAll());
    }


    public Result add(FirstPage firstPage) {
        medicalRecordDao.save(firstPage);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        medicalRecordDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
