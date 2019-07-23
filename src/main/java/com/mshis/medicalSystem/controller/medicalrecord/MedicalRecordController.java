package com.mshis.medicalSystem.controller.medicalrecord;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.FirstPage;
import com.mshis.medicalSystem.service.medicalrecord.MedicalRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 病案 controller
 * author: 沫凌
 * create: 2019-07-18 9:47
 */

@RestController
@RequestMapping("/medical-record")
@CrossOrigin
@Api(description = "病案")
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return medicalRecordService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "firstPage",value = "病案")
    @PostMapping("/add")
    public Result add(@RequestBody FirstPage firstPage){
        return medicalRecordService.add(firstPage);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "病案号(YYYY9999)")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer id){
        return medicalRecordService.delete(id);
    }
}
