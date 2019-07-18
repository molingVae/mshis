package com.mshis.medicalSystem.dao.hospitalizationControllerDao;

import com.mshis.medicalSystem.pojo.bean.PatientBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @Classname 病人信息资料
 * @Created by fanli
 * @Description TODO
 * @Date 2019/7/18 9:14
 */
@Component
public interface PatientBaseDao extends JpaRepository<PatientBase, Integer> {


//    public updatePatientBase()
}
