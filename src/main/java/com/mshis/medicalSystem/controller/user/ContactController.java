package com.mshis.medicalSystem.controller.user;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.FamilyMember;
import com.mshis.medicalSystem.service.user.ContactService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description: 家庭主要成员与社会关系
 * author: 沫凌
 * create: 2019-07-18 10:16
 */
@RestController
@RequestMapping("/contact")
@CrossOrigin
@Api(description = "家庭主要成员与社会关系")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return contactService.query();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "diagnose",value = "疾病诊断国际（ICD-9）编码")
    @PostMapping("/add")
    public Result add(FamilyMember familyMember){
        return contactService.add(familyMember);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "疾病诊断国际（ICD-9）ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return contactService.delete(id);
    }
}
