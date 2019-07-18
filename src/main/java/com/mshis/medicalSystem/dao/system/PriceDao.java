package com.mshis.medicalSystem.dao.system;

import com.mshis.medicalSystem.pojo.bean.ChargeType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-18 13:34
 */
public interface PriceDao extends JpaRepository<ChargeType,Integer> {
}
