package com.mshis.medicalSystem.dao.medicalrecord;

import com.mshis.medicalSystem.pojo.bean.Diagnose;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:  疾病诊断国际（ICD-9）编码表dao
 * author: 沫凌
 * create: 2019-07-18 9:02
 */
public interface DiseaseCodingDao extends JpaRepository<Diagnose,Integer> {

}
