package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//就医人员基本情况登记表
@Entity
@Table(name = "persons")
@Data
public class Persons implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personNo;    //就医人员编号

    private String personName; //姓名
    private Integer departmentNo;  //部门代码
    private Integer titleNo;  //职称代码
    private String personSex;    //性别
    private Integer chargeNo;    //收费类型代码
    private String telephony;    //电话号码
    private String contactAddress;  //地址
    private Date birthDate;    //出生日期
    private String married;    //婚否
    private Date registerDate;    //发证日期
    private String cardMark;    //补发医疗卡标记

}
