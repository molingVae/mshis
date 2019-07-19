package com.mshis.medicalSystem.controller.system;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.ChargeType;
import com.mshis.medicalSystem.service.system.PriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:收费类型代码
 * author: 沫凌
 * create: 2019-07-18 13:28
 */
@RestController
@RequestMapping("/price")
@CrossOrigin
@Api(description = "收费类型代码")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return priceService.query();
    }

    @ApiOperation(value = "添加")
    @ApiImplicitParam(name = "chargeType",value = "收费类型代码")
    @PostMapping("/add")
    public Result add(ChargeType chargeType){
        return priceService.add(chargeType);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "收费类型代码")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return priceService.delete(id);
    }


    @ApiOperation(value = "更新")
    @ApiImplicitParam(name = "chargeType",value = "收费类型代码")
    @PutMapping("/update")
    public Result update(ChargeType chargeType){
        return priceService.update(chargeType);

    }
}
