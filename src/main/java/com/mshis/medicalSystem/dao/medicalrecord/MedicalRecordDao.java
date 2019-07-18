package com.mshis.medicalSystem.dao.medicalrecord;

import com.mshis.medicalSystem.pojo.bean.FirstPage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 9:49
 */
public interface MedicalRecordDao extends JpaRepository<FirstPage,Integer> {
}
