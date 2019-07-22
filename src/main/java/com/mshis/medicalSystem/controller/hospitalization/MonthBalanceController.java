package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03MonthBalance;
import com.mshis.medicalSystem.service.hospitalization.MonthBalanceService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 月报表
 * author: 冯凡利
 * create:  2019/7/18 14:56
 */
@RestController
@CrossOrigin
@RequestMapping("/statistics")
public class MonthBalanceController {

    @Autowired
    private MonthBalanceService monthBalanceService;


    @ApiOperation("添加")
    @ApiImplicitParam(name = "Uh03MonthBalance", value = "添加月报表")
    @PostMapping("/income")
    public Result addMonthBalance(@RequestBody Uh03MonthBalance uh03MonthBalance){
        return monthBalanceService.addMonthBalance(uh03MonthBalance);
    }

    @ApiOperation("查询")
    @ApiImplicitParam(name = "", value = "查询月报表")
    @GetMapping("/query")
    public Result getAllMonthBalance(){
        return monthBalanceService.getAllMonthBalance();
    }

    @ApiOperation("删除")
    @ApiImplicitParam(name = "Uh03MonthBalance", value = "删除月报表")
    @GetMapping("/delete/{id}")
    public Result deleteMonthBalance(@PathVariable int id){
        return monthBalanceService.deleteMonthBalance(id);
    }
}
