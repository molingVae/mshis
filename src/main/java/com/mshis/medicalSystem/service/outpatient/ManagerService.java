package com.mshis.medicalSystem.service.outpatient;

import com.mshis.medicalSystem.dao.outpatient.CheckStandardDao;
import com.mshis.medicalSystem.dao.outpatient.DoctorDao;
import com.mshis.medicalSystem.dao.outpatient.SubjectCzcDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.CheckStandard;
import com.mshis.medicalSystem.pojo.bean.Doctor;
import com.mshis.medicalSystem.pojo.bean.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Service
public class ManagerService {

    @Autowired
    private DoctorDao doctorDao;//医生科室

    @Autowired
    private CheckStandardDao checkStandardDao;//检查项目

    @Autowired
    private SubjectCzcDao subjectDao;//科目类别

    /**
     * 医生科室
     * @param doctor
     * @return
     */
    public Result addDoctor(Doctor doctor) {
        doctorDao.save(doctor);
        return new Result(Code.OK,"添加成功");
    }

    public Result deleteDoctor(Integer id) {
        doctorDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result addCheckStandard(CheckStandard checkStandard) {
        checkStandardDao.save(checkStandard);
        return new Result(Code.OK,"添加成功");
    }

    public Result deleteCheckStandard(Integer id) {
        checkStandardDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }


    public Result addSubject(Subject subject) {
        subjectDao.save(subject);
        return new Result(Code.OK,"添加成功");
    }

    public Result deleteSubject(Integer id) {
        subjectDao.deleteById(id);
        return new Result(Code.OK,"删除成功");
    }

    public Result findSubjectAll() {
        Result result=new Result(Code.OK,"查询成功");
        result.setData(subjectDao.findAll());
        return result;
    }

    public Result findDoctorAll() {
        Result result=new Result(Code.OK,"查询成功");
        result.setData(doctorDao.findAll());
        return result;
    }

    public Result findAllCheck() {
        Result result=new Result(Code.OK,"查询成功");
        result.setData(checkStandardDao.findAll());
        return result;
    }
}
