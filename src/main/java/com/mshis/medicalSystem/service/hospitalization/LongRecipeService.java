package com.mshis.medicalSystem.service.hospitalization;

import com.mshis.medicalSystem.dao.hospitalization.LongRecipeDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh04LongRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: 长期医嘱
 * author: 冯凡利
 * create:  2019/7/18 10:57
 */
@Service
public class LongRecipeService {

    @Autowired
    private LongRecipeDao longRecipeDao;

    @Autowired
    private Code code;

    /**
     * 长期医嘱处理  添加
     */
    public Result addLongRecipe(Uh04LongRecipe uh04LongRecipe){
        Uh04LongRecipe save = longRecipeDao.save(uh04LongRecipe);
        Result result = new Result(code.OK, "添加成功");
        return result;
    }
}
