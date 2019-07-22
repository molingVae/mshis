package com.mshis.medicalSystem.service.hospitalizationControllerService;

import com.mshis.medicalSystem.dao.hospitalizationControllerDao.PatientBaseDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.PatientBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname 病人信息资料
 * @Created by fanli
 * @Description TODO
 * @Date 2019/7/18 9:16
 */
@Service
public class PatientBaseService {

    @Autowired
    private PatientBaseDao patientBaseDao;



    @Autowired
    private Code code;

    /**
     * 病人基本资料登记
     */
    public Result addPatientBaseMessage(PatientBase patientBase){
        PatientBase save = patientBaseDao.save(patientBase);
        Result result = new Result(code.OK, "保存成功");
        return result;
    }

    /**
     * 病人基本资料查询
     */
    public Result getAllPatientBaseMessage(){
        List<PatientBase> all = patientBaseDao.findAll();
        Result result = new Result(code.OK,"查询成功",all);
        return result;
    }

    /**
     * 病人基本资料修改
     */
    public Result updatePatientBaseMessage(PatientBase patientBase){
        Result result = new Result(code.OK,"修改成功");
        PatientBase patientBase1 = patientBaseDao.save(patientBase);
        return result;
    }

    /**
     * 病人基本资料删除
     */
    public Result deletePatientBase(int id){
        patientBaseDao.deleteById(id);
        Result result = new Result(code.OK,"删除成功");
        return result;
    }


}
