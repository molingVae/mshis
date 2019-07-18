package com.mshis.medicalSystem.controller.system;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.UserAuth;
import com.mshis.medicalSystem.service.system.AuthorityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * description:用户权限管理
 * author: 沫凌
 * create: 2019-07-18 13:08
 */
@RestController
@RequestMapping("/authority")
@CrossOrigin
@Api(description = "用户权限管理")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @ApiOperation(value = "查询")
    @GetMapping("/query")
    public Result query(){
        return authorityService.query();
    }

    @ApiOperation(value = "添加")
    @ApiImplicitParam(name = "userAuth",value = "用户权限")
    @PostMapping("/add")
    public Result add(UserAuth userAuth){
        return authorityService.add(userAuth);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "用户权限ID")
    @DeleteMapping("/delete")
    public Result delete(Integer id){
        return authorityService.delete(id);
    }


    @ApiOperation(value = "更新")
    @ApiImplicitParam(name = "userAuth",value = "用户权限")
    @PutMapping("/update")
    public Result update(UserAuth userAuth){
        return authorityService.update(userAuth);

    }

}
