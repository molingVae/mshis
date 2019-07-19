package com.mshis.medicalSystem.controller.outpatient;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Register;
import com.mshis.medicalSystem.service.outpatient.RegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/18
 */
@RestController
@RequestMapping("/register")
@CrossOrigin
@Api(description = "挂号")
public class RegisterController {
    @Autowired
    private RegisterService registerService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return registerService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "uh03Price",value = "挂号")
    @PostMapping("/add")
    public Result add(Register register){
        return registerService.add(register);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "挂号ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return registerService.delete(id);
    }
    
}
