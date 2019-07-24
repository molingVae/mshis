package com.mshis.medicalSystem.controller.pharmacy;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03Price;
import com.mshis.medicalSystem.service.pharmacy.PharmacyPriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/18
 */
@RestController
@RequestMapping("/pharmacyprice")
@CrossOrigin
@Api(description = "调价处理（药品价格零售表)")
public class PharmacyPriceController {
    @Autowired
    private PharmacyPriceService uh03PriceService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return uh03PriceService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "uh03Price",value = "调价")
    @PostMapping("/add")
    public Result add(Uh03Price uh03Price){
        return uh03PriceService.add(uh03Price);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "调价ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return uh03PriceService.delete(id);
    }

    @ApiOperation(value = "修改")
    @ApiImplicitParam(name = "uh03Price",value = "调价")
    @PostMapping("/update")
    public Result save(Uh03Price uh03Price){
        return uh03PriceService.save(uh03Price);
    }
}
