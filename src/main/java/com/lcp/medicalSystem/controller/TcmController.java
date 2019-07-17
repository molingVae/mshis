package com.lcp.medicalSystem.controller;

import com.lcp.medicalSystem.pojo.Result;
import com.lcp.medicalSystem.service.TcmService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-14 9:25
 */
@RestController
@Api(value = "药物api",description = "药物api")
@RequestMapping("/tcm")
public class TcmController {

    @Autowired
    private TcmService tcmService;

    @ApiOperation(value = "获取药物信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "title",value = "名称",required = true,paramType = "path"),
            @ApiImplicitParam(name = "page",value = "页码",required = true,paramType = "path"),
            @ApiImplicitParam(name = "size",value = "数量",required = true,paramType = "path")
    })
    @GetMapping("/getTcm/{title}/{page}/{size}")
    public Result getTcm(@PathVariable String title,@PathVariable int page,@PathVariable int size){
        return tcmService.getTcmByTitle(title,page,size);
    }

}
