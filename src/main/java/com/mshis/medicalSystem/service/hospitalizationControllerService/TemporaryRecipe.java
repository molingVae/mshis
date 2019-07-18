package com.mshis.medicalSystem.service.hospitalizationControllerService;

import com.mshis.medicalSystem.dao.hospitalizationControllerDao.TemporaryRecipeDao;
import com.mshis.medicalSystem.pojo.Code;
import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh04TemporaryRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: 临时医嘱等级
 * author: 冯凡利
 * create:  2019/7/18 11:13
 */
@Service
public class TemporaryRecipe {

    @Autowired
    private TemporaryRecipeDao temporaryRecipeDao;

    @Autowired
    private Code code;

    public Result addTemporaryRecipe(Uh04TemporaryRecipe uh04TemporaryRecipe){
        temporaryRecipeDao.save(uh04TemporaryRecipe);
        Result result = new Result(Code.OK, "插入成功");
        return result;
    }

}
