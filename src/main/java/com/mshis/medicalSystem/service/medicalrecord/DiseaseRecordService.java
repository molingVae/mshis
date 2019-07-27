package com.mshis.medicalSystem.service.medicalrecord;

import com.mshis.medicalSystem.dao.medicalrecord.DiseaseRecordDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.CaseHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 10:05
 */
@Service
public class DiseaseRecordService {

    @Autowired
    private DiseaseRecordDao diseaseRecordDao;


    public Result query(CaseHistory caseHistory) {
        return new Result(Code.OK,"查询成功",diseaseRecordDao.
                findFirstByChNumAndChTimes(caseHistory.getChNum(),caseHistory.getChTimes()));
    }


    public Result add(CaseHistory caseHistory) {
        diseaseRecordDao.save(caseHistory);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        diseaseRecordDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }
}
