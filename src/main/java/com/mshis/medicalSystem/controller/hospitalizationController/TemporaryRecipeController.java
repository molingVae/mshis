package com.mshis.medicalSystem.controller.hospitalizationController;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh04TemporaryRecipe;
import com.mshis.medicalSystem.service.hospitalizationControllerService.TemporaryRecipe;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 临时医嘱登记
 * author: 冯凡利
 * create:  2019/7/18 11:18
 */
@RestController
@RequestMapping("/room")
@CrossOrigin
@Api("临时医嘱登记")
public class TemporaryRecipeController {

    @Autowired
    private TemporaryRecipe temporaryRecipe;

    @ApiOperation("插入")
    @ApiImplicitParam(name = "Uh04TemporaryRecipe", value = "添加临时医嘱")
    @PostMapping("/temporary/add")
    public Result addTemporaryRecipe(@RequestBody Uh04TemporaryRecipe uh04TemporaryRecipe){
        return temporaryRecipe.addTemporaryRecipe(uh04TemporaryRecipe);
    }


}
