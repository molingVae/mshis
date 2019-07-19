package com.mshis.medicalSystem.dao.hospitalization;

import com.mshis.medicalSystem.pojo.bean.Uh03MonthBalance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 月结表
 * author: 冯凡利
 * create:  2019/7/18 14:50
 */
@Component
public interface MonthBalanceDao extends JpaRepository<Uh03MonthBalance, Integer> {
}
