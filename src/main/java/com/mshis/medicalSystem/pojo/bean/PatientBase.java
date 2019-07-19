package com.mshis.medicalSystem.pojo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//入院病人基本资料登记表 27
@Entity
@Table(name = "patientBase")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientNo;    //住院号

    private Date inDate;    //入院日期
    private String patientName; //姓名
    private String patientSex;  //性别
    private Date birthDate;  //出生日期
    private String marry;    //婚否
    private String occupation;    //职业
    private String titleName;    //职称
    private String nativePlace;  //籍贯
    private String nationality;    //国籍
    private String capacityNo;    //身份证号
    private String staffNo;    //医疗证号
    private String workPlace;    //工作单位
    private String homeAdder;    //住址
    private String heName;    //联系人
    private String heTel;    //联系人电话
    private String relation;    //关系
    private String costMode;    //交费方式
    private String patientCost;    //个人分担
    private String costType;    //费别
    private String settleType;    //结帐方式
    private String payMoney;    //预交款
    private String diagnoseName;    //疾病诊断
    private String icd9;    //ICD-9编码
    private String section;    //科别
    private String bedNo;    //床号
    private Date outDate;  //出院日期


}