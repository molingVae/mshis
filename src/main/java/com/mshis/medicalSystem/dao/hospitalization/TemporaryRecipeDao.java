package com.mshis.medicalSystem.dao.hospitalization;

import com.mshis.medicalSystem.pojo.bean.Uh04TemporaryRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 临时医嘱
 * author: 冯凡利
 * create:  2019/7/18 11:12
 */
@Component
public interface TemporaryRecipeDao extends JpaRepository<Uh04TemporaryRecipe, Integer> {
}
