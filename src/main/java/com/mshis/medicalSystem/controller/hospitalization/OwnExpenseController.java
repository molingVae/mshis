package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.service.hospitalization.OwnExpenseService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 住院部资金日报表
 * author: 冯凡利
 * create:  2019/7/18 15:07
 */
@RestController
@CrossOrigin
@RequestMapping("/statistics")
public class OwnExpenseController {

    @Autowired
    private OwnExpenseService ownExpenseService;

    @ApiOperation("查询")
    @ApiImplicitParam(name = "", value = "查询 日报表")
    @GetMapping("/capital")
    public Result getALlOwnExpense(){
        return ownExpenseService.getAllOwnExpense();
    }
}
