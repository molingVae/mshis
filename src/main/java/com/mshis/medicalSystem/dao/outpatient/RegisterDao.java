package com.mshis.medicalSystem.dao.outpatient;

import com.mshis.medicalSystem.pojo.bean.Register;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 小白的PC on 2019/7/18
 */
public interface RegisterDao extends JpaRepository<Register,Integer> {
}
