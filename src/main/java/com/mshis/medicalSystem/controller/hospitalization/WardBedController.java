package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Ward;
import com.mshis.medicalSystem.service.hospitalization.WardBedService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 床位登记
 * author: 冯凡利
 * create:  2019/7/18 11:32
 */
@RestController
@CrossOrigin
@RequestMapping("/room")
@Api("床位登记")
public class WardBedController {

    @Autowired
    private WardBedService wardBedService;


    @ApiOperation("插入")
    @ApiImplicitParam(name = "Ward",value = "插入床位")
    @PostMapping("/bed/add")
    public Result addWardBed(@RequestBody Ward ward){
        return wardBedService.addWardBed(ward);
    }

    @ApiOperation("修改")
    @ApiImplicitParam(name = "Ward",value = "修改床位")
    @PostMapping("/bed/update")
    public Result updateWardBed(@RequestBody Ward ward){
        return wardBedService.addWardBed(ward);
    }

    @ApiOperation("查询")
    @ApiImplicitParam(name = "Ward",value = "查询所有床位")
    @GetMapping("/bed/get")
    public Result updateWardBed(){
        return wardBedService.getAll();
    }




}
