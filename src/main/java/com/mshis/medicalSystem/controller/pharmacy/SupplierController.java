package com.mshis.medicalSystem.controller.pharmacy;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Uh03CompanyList;
import com.mshis.medicalSystem.pojo.bean.Uh03Price;
import com.mshis.medicalSystem.service.pharmacy.SupplierService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/18
 */
@RestController
@RequestMapping("/supplier")
@CrossOrigin
@Api(description = "供应商编码")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;


    @ApiOperation(value = "查询")
    @PostMapping("/query/{page}/{size}")
    public Result query(@RequestBody(required = false) Uh03CompanyList uh03CompanyList, @PathVariable int page, @PathVariable int size){
        return supplierService.query(uh03CompanyList,page,size);
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "uh03CompanyList",value = "供应商编码")
    @PostMapping("/add")
    public Result add(@RequestBody  Uh03CompanyList uh03CompanyList){
        return supplierService.add(uh03CompanyList);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "供应商编码ID")
    @GetMapping("/delete/{id}")
    public Result delete(@PathVariable  Integer id){
        return supplierService.delete(id);
    }

    @ApiOperation(value = "修改")
    @ApiImplicitParam(name = "uh03CompanyList",value = "供应商编码")
    @PostMapping("/update")
    public Result update(@RequestBody  Uh03CompanyList uh03CompanyList){
        return supplierService.update(uh03CompanyList);

    }
}
