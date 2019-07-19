package com.mshis.medicalSystem.controller.system;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Paraments;
import com.mshis.medicalSystem.service.system.ParameterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:系统参数
 * author: 沫凌
 * create: 2019-07-18 13:15
 */

@RestController
@RequestMapping("/parameter")
@CrossOrigin
@Api(description = "系统参数")
public class ParameterController {

    @Autowired
    private ParameterService parameterService;

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return parameterService.query();
    }

    @ApiOperation(value = "添加")
    @ApiImplicitParam(name = "paraments",value = "系统参数")
    @PostMapping("/add")
    public Result add(Paraments paraments){
        return parameterService.add(paraments);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "系统参数ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return parameterService.delete(id);
    }


    @ApiOperation(value = "更新")
    @ApiImplicitParam(name = "paraments",value = "系统参数")
    @PutMapping("/update")
    public Result update(Paraments paraments){
        return parameterService.update(paraments);

    }
}
