package com.mshis.medicalSystem.controller.pharmacy;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03StoreIn;
import com.mshis.medicalSystem.pojo.bean.Uh03StoreOut;
import com.mshis.medicalSystem.service.pharmacy.InAndOutService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: in/out库controller
 * author: 小白
 * create: 2019-07-18 10:26
 */
@RestController
@RequestMapping
@CrossOrigin
@Api(description = "in/out库")
public class InAndOutController {

    @Autowired
    private InAndOutService inAndOutService;

    @ApiOperation(value = "入库")
    @ApiImplicitParam(name = "uh03StoreIn",value = "入库登记")
    @PostMapping("/in")
    public Result in(@RequestBody Uh03StoreIn uh03StoreIn){
        return inAndOutService.in(uh03StoreIn);
    }

    @ApiOperation(value = "出库")
    @ApiImplicitParam(name = "uh03StoreOut",value = "出库登记")
    @PostMapping("/out")
    public Result out(@RequestBody Uh03StoreOut uh03StoreOut){
        return inAndOutService.out(uh03StoreOut);
    }

    @ApiOperation(value = "查询入库表")
    @ApiImplicitParam(name = "uh03StoreOut",value = "入库表")
    @GetMapping("/query/in")
    public Result queryIn(){
        return inAndOutService.queryIn();
    }

    @ApiOperation(value = "查询出库表")
    @ApiImplicitParam(name = "uh03StoreOut",value = "出库表")
    @GetMapping("/query/out")
    public Result queryOut(){
        return inAndOutService.queryOut();
    }
}
