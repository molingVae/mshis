package com.mshis.medicalSystem.dao.outpatient;

import com.mshis.medicalSystem.pojo.bean.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by 小白的PC on 2019/7/18
 */
public interface SubjectCzcDao extends JpaRepository<Subject,Integer> {
}
