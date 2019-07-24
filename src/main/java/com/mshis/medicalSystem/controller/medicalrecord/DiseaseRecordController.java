package com.mshis.medicalSystem.controller.medicalrecord;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.CaseHistory;
import com.mshis.medicalSystem.service.medicalrecord.DiseaseRecordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:病历
 * author: 沫凌
 * create: 2019-07-18 10:03
 */
@RestController
@RequestMapping("/disease-record")
@CrossOrigin
@Api(description = "病历")
public class DiseaseRecordController {

    @Autowired
    private DiseaseRecordService diseaseRecordService;

    @ApiOperation(value = "查询")
    @PostMapping("/query")
    public Result query(@RequestBody CaseHistory caseHistory){

        return diseaseRecordService.query(caseHistory);
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "caseHistory",value = "病历")
    @PostMapping("/add")
    public Result add(@RequestBody CaseHistory caseHistory){
        return diseaseRecordService.add(caseHistory);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "病案号(YYYY9999)")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer id){
        return diseaseRecordService.delete(id);
    }
}
