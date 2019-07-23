package com.mshis.medicalSystem.controller.medicalrecord;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Operation;
import com.mshis.medicalSystem.service.medicalrecord.OperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:手术情况
 * author: 沫凌
 * create: 2019-07-18 9:57
 */
@RestController
@RequestMapping("/operation")
@CrossOrigin
@Api(description = "手术情况")
public class OperationController {

    @Autowired
    private OperationService operationService;

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return operationService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "operation",value = "手术情况")
    @PostMapping("/add")
    public Result add(@RequestBody Operation operation){
        return operationService.add(operation);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "病案号(YYYY9999)")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer id){
        return operationService.delete(id);
    }
}
