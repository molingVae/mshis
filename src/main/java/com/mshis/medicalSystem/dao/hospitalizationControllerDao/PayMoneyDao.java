package com.mshis.medicalSystem.dao.hospitalizationControllerDao;

import com.mshis.medicalSystem.pojo.bean.PayMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 病人预交款情况登记
 * author: 冯凡利
 * create:  2019/7/18 15:37
 */
@Component
public interface PayMoneyDao extends JpaRepository<PayMoney, Integer> {
}
