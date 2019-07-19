package com.mshis.medicalSystem.dao.system;

import com.mshis.medicalSystem.pojo.bean.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:24
 */
public interface MedicinerDao extends JpaRepository<Persons,Integer> {
}
