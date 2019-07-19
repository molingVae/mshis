package com.mshis.medicalSystem.dao.user;

import com.mshis.medicalSystem.pojo.bean.PersonBase;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 10:22
 */
public interface StaffDao extends JpaRepository<PersonBase,Integer> {
}
