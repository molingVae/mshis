package com.mshis.medicalSystem.dao.user;

import com.mshis.medicalSystem.pojo.bean.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 10:26
 */
public interface ContactDao extends JpaRepository<FamilyMember,Integer> {
}
