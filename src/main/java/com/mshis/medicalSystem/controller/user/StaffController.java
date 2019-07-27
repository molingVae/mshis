package com.mshis.medicalSystem.controller.user;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.PersonBase;
import com.mshis.medicalSystem.service.user.StaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:人事基本资料
 * author: 沫凌
 * create: 2019-07-18 10:16
 */
@RestController
@RequestMapping("/staff")
@CrossOrigin
@Api(description = "人事基本资料")
public class StaffController {

    @Autowired
    private StaffService staffService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return staffService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "personBase",value = "人事基本资料")
    @PostMapping("/add")
    public Result add( PersonBase personBase){
        return staffService.add(personBase);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "职工编号")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return staffService.delete(id);
    }
}
