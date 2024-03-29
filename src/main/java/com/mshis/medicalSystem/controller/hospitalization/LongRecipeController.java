package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh04LongRecipe;
import com.mshis.medicalSystem.service.hospitalization.LongRecipeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 长期医嘱登记
 * author: 冯凡利
 * create:  2019/7/18 11:01
 */
@RestController
@RequestMapping("/room")
@CrossOrigin
@Api("长期医嘱登记")
public class LongRecipeController {

    @Autowired
    private LongRecipeService longRecipeService;

    @ApiOperation("添加")
    @ApiImplicitParam(name = "Uh04LongRecipe", value = "添加")
    @PostMapping("/long/add")
    public Result addLongRecipe( @RequestBody Uh04LongRecipe uh04LongRecipe){
        return longRecipeService.addLongRecipe(uh04LongRecipe);
    }

}
