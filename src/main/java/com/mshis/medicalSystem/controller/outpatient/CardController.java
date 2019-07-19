package com.mshis.medicalSystem.controller.outpatient;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Card;
import com.mshis.medicalSystem.service.outpatient.CardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/19
 */
@RestController
@RequestMapping("/card")
@CrossOrigin
@Api(description = "医疗卡")
public class CardController {
    @Autowired
    private CardService cardService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return cardService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "card",value = "医疗卡")
    @PostMapping("/add")
    public Result add(Card card){
        return cardService.add(card);
    }
    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "card",value = "医疗卡挂失")
    @PostMapping("/lose")
    public Result flag(Card card){
        return cardService.flag(card);
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "card",value = "医疗卡充值")
    @PostMapping("/recharge")
    public Result saveMoney(Card card){
        return cardService.saveMoney(card);
    }

}
