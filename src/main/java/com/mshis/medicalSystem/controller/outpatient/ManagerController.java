package com.mshis.medicalSystem.controller.outpatient;

import com.mshis.medicalSystem.pojo.Result;
import com.mshis.medicalSystem.pojo.bean.CheckStandard;
import com.mshis.medicalSystem.pojo.bean.Doctor;
import com.mshis.medicalSystem.pojo.bean.Subject;
import com.mshis.medicalSystem.service.outpatient.ManagerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 小白的PC on 2019/7/18
 */
@RestController
@RequestMapping("/manager")
@CrossOrigin
@Api(description = "其他管理")
public class ManagerController {

    @Autowired
    private ManagerService managerService;


    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "doctor",value = "医生科室")
    @PostMapping("/doctor/add")
    public Result addDoctor(@RequestBody Doctor doctor){
        return managerService.addDoctor(doctor);

    }

    @ApiOperation(value = "查询")
    @ApiImplicitParam(name = "doctor",value = "医生科室")
    @GetMapping("/doctor/query")
    public Result getDoctorAll(){
        return managerService.findDoctorAll();

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "医生科室ID")
    @DeleteMapping("/doctor/delete")
    public Result deleteDoctor(@RequestBody Integer id){
        return managerService.deleteDoctor(id);
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "checkStandard",value = "检查项目")
    @PostMapping("/outpatient/add")
    public Result addCheckStandard(@RequestBody CheckStandard checkStandard){
        return managerService.addCheckStandard(checkStandard);

    }

    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "检查项目ID")
    @DeleteMapping("/outpatient/delete")
    public Result deleteCheckStandard(Integer id){
        return managerService.deleteCheckStandard(id);
    }


    @ApiOperation(value = "查询")
    @ApiImplicitParam(name = "id",value = "查询检查项目ID")
    @GetMapping("/outpatient/query")
    public Result getAllCheckStandard(){
        return managerService.findAllCheck();
    }

    @ApiOperation(value = "录入")
    @ApiImplicitParam(name = "subject",value = "门诊科目")
    @PostMapping("/check/add")
    public Result addSubject(Subject subject){
        return managerService.addSubject(subject);

    }

    @ApiOperation(value = "查询门诊科目")
    @ApiImplicitParam(name = "subject",value = "查询门诊科目")
    @GetMapping("/check/query")
    public Result getAll(){
        return managerService.findSubjectAll();

    }



    @ApiOperation(value = "删除")
    @ApiImplicitParam(name = "id",value = "门诊科目ID")
    @DeleteMapping("/check/delete")
    public Result deleteSubject(Integer id){
        return managerService.deleteSubject(id);
    }

}
