package com.mshis.medicalSystem.controller.outpatient;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Treat;
import com.mshis.medicalSystem.service.outpatient.OutpatientPriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/18
 */

@RestController
@RequestMapping("/outpatientprice")
@CrossOrigin
@Api(description = "门诊收费")
public class OutpatientPriceController {

    @Autowired
    private OutpatientPriceService outpatientPriceService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return outpatientPriceService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "treat",value = "门诊收费")
    @PostMapping("/add")
    public Result add(@RequestBody Treat treat){
        return outpatientPriceService.add(treat);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "门诊收费ID")
    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer id){
        return outpatientPriceService.delete(id);
    }
}
