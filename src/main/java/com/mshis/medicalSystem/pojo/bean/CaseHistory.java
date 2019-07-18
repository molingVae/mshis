package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * description: 病例
 * author: 沫凌
 * create: 2019-07-14 9:10
 */
@Entity
@Table(name = "caseHistory")
@Data
public class CaseHistory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer chNum;    //	病案号(YYYY9999)

    private Integer chTimes;    //	第几次入院
    private String chName;    //	姓名
    private String chDepartment;    //	科别
    private String chBed;    //	床号
    private Integer chXRayNum;    //	X光号
    private Integer chCardiographNum;    //	心电图号
    private Integer chElectroencephogramNum;    //	脑电图号
    private Integer chPathologyNum;    //	病理号
    private String chInStatus;    //	入院时情况
    private String chCureCourse;    //	治疗经过
    private String chOutStatus;    //	出院时情况
    private String chOutDoctorAdvice;    //	出院医嘱
    private String chSignatureDirectorDoctor;    //	科主任或副主任医师签名
    private String chSignatureChargeDoctor;    //	主治医师签名
    private String chSignatureHouseDoctor;    //	住院医师签名
    private String chSignatureIntern;    //	实习医师签名

}
