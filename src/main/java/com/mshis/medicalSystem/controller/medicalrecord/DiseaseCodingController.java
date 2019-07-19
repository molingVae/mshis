package com.mshis.medicalSystem.controller.medicalrecord;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Diagnose;
import com.mshis.medicalSystem.service.medicalrecord.DiseaseCodingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 疾病诊断国际（ICD-9）编码表controller
 * author: 沫凌
 * create: 2019-07-18 9:04
 */
@RestController
@RequestMapping("/disease-coding")
@CrossOrigin
@Api(description = "疾病诊断国际（ICD-9）编码")
public class DiseaseCodingController {

    @Autowired
    private DiseaseCodingService diseaseCodingService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
           return diseaseCodingService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "diagnose",value = "疾病诊断国际（ICD-9）编码")
    @PostMapping("/add")
    public Result add(Diagnose diagnose){
        return diseaseCodingService.add(diagnose);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "疾病诊断国际（ICD-9）ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return diseaseCodingService.delete(id);
    }
}