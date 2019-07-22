package com.mshis.medicalSystem.dao.hospitalizationControllerDao;

import com.mshis.medicalSystem.pojo.bean.Uh04LongRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * description: 长期医嘱登记
 * author: 冯凡利
 * create:  2019/7/18 10:52
 */
@Component
public interface LongRecipeDao extends JpaRepository<Uh04LongRecipe, Integer> {
}
