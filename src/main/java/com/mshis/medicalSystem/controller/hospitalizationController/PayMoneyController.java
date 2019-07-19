package com.mshis.medicalSystem.controller.hospitalizationController;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.PayMoney;
import com.mshis.medicalSystem.service.hospitalizationControllerService.PayMoneyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: 病人预交款情况登记
 * author: 冯凡利
 * create:  2019/7/18 15:41
 */
@RestController
@RequestMapping("/leave")
@CrossOrigin
@Api("病人预交款情况登记")
public class PayMoneyController {

    @Autowired
    private PayMoneyService payMoneyService;

    @ApiOperation("插入")
    @ApiImplicitParam(name = "Subject", value = "插入科目编码")
    @PostMapping("/settlement")
    public Result addSubject(PayMoney payMoney){
        return payMoneyService.addPayMoney(payMoney);
    }

}
