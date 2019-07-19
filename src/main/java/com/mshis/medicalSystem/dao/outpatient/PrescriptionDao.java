package com.mshis.medicalSystem.dao.outpatient;

import com.mshis.medicalSystem.pojo.bean.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 小白的PC on 2019/7/19
 */
public interface PrescriptionDao extends JpaRepository<Prescription,Integer> {
}
