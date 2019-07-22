package com.mshis.medicalSystem.controller.hospitalization;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.Subject;
import com.mshis.medicalSystem.service.hospitalization.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 科目编码
 * author: 冯凡利
 * create:  2019/7/18 13:29
 */
@CrossOrigin
@RestController
@RequestMapping("/price")
@Api("科目编码")
public abstract class SubjectController  {

     @Autowired
     private SubjectService subjectService;


     @ApiOperation("插入")
     @ApiImplicitParam(name = "Subject", value = "插入科目编码")
     @PostMapping("/subject-coding/add")
     public Result addSubject(@RequestBody Subject subject){
         return subjectService.addSubject(subject);
     }


    @ApiOperation("修改")
    @ApiImplicitParam(name = "Subject", value = "修改科目编码")
    @PostMapping("/subject-coding/update")
    public Result updateSubject(@RequestBody Subject subject){
        return subjectService.updateSubject(subject);
    }


    @ApiOperation("查询")
    @ApiImplicitParam(name = "Subject", value = "查询科目编码")
    @GetMapping("/subject-coding/query")
    public Result getAllSubject(){
        return subjectService.getAllSubject();
    }

    @ApiOperation("删除")
    @ApiImplicitParam(name = "Subject", value = "删除科目编码")
    @GetMapping("/subject-coding/delete/{id}")
    public Result deleteSubject(@PathVariable int id){
        return subjectService.deleteSubject(id);
    }






    @ApiOperation("记账")
    @ApiImplicitParam(name = "",value = "")
    @PostMapping("/")
    public Result findAccount(){

         return null;
    }


}
