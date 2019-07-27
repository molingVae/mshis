package com.mshis.medicalSystem.controller.system;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Persons;
import com.mshis.medicalSystem.service.system.MedicinerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:就医人员
 * author: 沫凌
 * create: 2019-07-18 13:21
 */
@RestController
@RequestMapping("/mediciner")
@CrossOrigin
@Api(description = "就医人员")
public class MedicinerController {

    @Autowired
    private MedicinerService medicinerService;

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return medicinerService.query();
    }

    @ApiOperation(value = "添加")
    @ApiImplicitParam(name = "persons",value = "就医人员")
    @PostMapping("/add")
    public Result add(Persons persons){
        return medicinerService.add(persons);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "就医人员ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return medicinerService.delete(id);
    }


    @ApiOperation(value = "更新")
    @ApiImplicitParam(name = "persons",value = "就医人员")
    @PutMapping("/update")
    public Result update(Persons persons){
        return medicinerService.update(persons);

    }
}
