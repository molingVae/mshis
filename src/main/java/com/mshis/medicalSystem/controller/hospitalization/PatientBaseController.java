package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.PatientBase;
import com.mshis.medicalSystem.service.hospitalization.PatientBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 病人信息资料
 * author: 冯凡利
 * create:  2019/7/18 9:53
 */
@RestController
@RequestMapping("/patient")
@CrossOrigin
@Api("病人信息资料")
public class PatientBaseController {

    @Autowired
    private PatientBaseService patientBaseService;

    @ApiOperation("录入")
    @ApiImplicitParam(name = "PatientBase", value = "添加病人基本信息")
    @PostMapping("/add")
    public Result addPatientBaseMessage(@RequestBody PatientBase patientBase){
        return patientBaseService.addPatientBaseMessage(patientBase);
    }

    @ApiOperation("查询")
    @ApiImplicitParam(name = "", value = "查询病人基本资料")
    @GetMapping("/query")
    public Result getAllPatientBaseMessage(){
        Result allPatientBaseMessage = patientBaseService.getAllPatientBaseMessage();
        System.out.println(allPatientBaseMessage.getData().toString());
        return  patientBaseService.getAllPatientBaseMessage();

    }

    @ApiOperation("修改")
    @ApiImplicitParam(name = "Id", value = "修改病人基本资料")
    @PostMapping("/update")
    public Result updatePatientBaseMessage(@RequestBody PatientBase patientBase){
        return patientBaseService.updatePatientBaseMessage(patientBase);
    }

    @ApiOperation("删除")
    @ApiImplicitParam(name = "Id", value = "删除病人基本资料")
    @GetMapping("/delete/{id}")
    public Result deletePatientBaseMessage(@PathVariable int Id){
        return patientBaseService.deletePatientBase(Id);
    }


}
