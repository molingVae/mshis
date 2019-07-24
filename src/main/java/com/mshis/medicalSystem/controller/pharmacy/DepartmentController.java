package com.mshis.medicalSystem.controller.pharmacy;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Department;
import com.mshis.medicalSystem.service.pharmacy.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/18
 */
@RestController
@RequestMapping("/department")
@CrossOrigin
@Api(description = "部门编码")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "department",value = "部门编码")
    @PostMapping("/add")
    public Result add(@RequestBody Department department){
        return departmentService.add(department);

    }
    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "部门编码ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return departmentService.delete(id);
    }

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return departmentService.query();
    }
}
