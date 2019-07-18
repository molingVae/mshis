package com.mshis.medicalSystem.dao.medicalrecord;

import com.mshis.medicalSystem.pojo.bean.CaseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 10:07
 */
public interface DiseaseRecordDao extends JpaRepository<CaseHistory,Integer> {
}
