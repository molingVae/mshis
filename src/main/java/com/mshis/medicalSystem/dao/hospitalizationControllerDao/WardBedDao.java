package com.mshis.medicalSystem.dao.hospitalizationControllerDao;

import com.mshis.medicalSystem.pojo.bean.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 床位登记
 * author: 冯凡利
 * create:  2019/7/18 11:29
 */
@Component
public interface WardBedDao extends JpaRepository<Ward, Integer> {
}
