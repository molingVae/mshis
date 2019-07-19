package com.mshis.medicalSystem.service.outpatient;

import com.mshis.medicalSystem.dao.outpatient.TreatDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Treat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Service
@Transactional
public class OutpatientPriceService {

    @Autowired
    private TreatDao treatDao;//病人看病

    public Result query() {
        return new Result(Code.OK,"查询成功",treatDao.findAll());
    }


    public Result add(Treat treat) {
        treatDao.save(treat);
        return new Result(Code.OK,"添加成功");
    }


    public Result delete(Integer id) {
        treatDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

}
