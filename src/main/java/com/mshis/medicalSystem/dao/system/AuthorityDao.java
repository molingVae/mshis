package com.mshis.medicalSystem.dao.system;

import com.mshis.medicalSystem.pojo.bean.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:13
 */
public interface AuthorityDao extends JpaRepository<UserAuth,Integer> {
}
