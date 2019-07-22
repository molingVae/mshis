package com.mshis.medicalSystem.dao.hospitalizationControllerDao;

import com.mshis.medicalSystem.pojo.bean.ChargeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 收费标准管理
 * author: 冯凡利
 * create:  2019/7/18 15:13
 */
@Component
public interface ChargeTypeDao extends JpaRepository<ChargeType, Integer> {
}
