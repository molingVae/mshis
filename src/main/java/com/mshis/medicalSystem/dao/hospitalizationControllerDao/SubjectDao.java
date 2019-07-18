package com.mshis.medicalSystem.dao.hospitalizationControllerDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 科目编码
 * author: 冯凡利
 * create:  2019/7/18 13:22
 */
@Component
public interface SubjectDao extends JpaRepository<SubjectDao, Integer> {
}
