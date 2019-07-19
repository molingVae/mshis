package com.mshis.medicalSystem.dao.outpatient;

import com.mshis.medicalSystem.pojo.bean.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 小白的PC on 2019/7/18
 */
public interface DoctorDao extends JpaRepository<Doctor,Integer> {
}
