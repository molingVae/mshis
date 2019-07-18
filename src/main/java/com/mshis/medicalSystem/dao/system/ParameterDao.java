package com.mshis.medicalSystem.dao.system;

import com.mshis.medicalSystem.pojo.bean.Paraments;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:19
 */
public interface ParameterDao extends JpaRepository<Paraments,Integer> {
}
