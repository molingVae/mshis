package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * description: 人事基本资料
 * author: 沫凌
 * create: 2019-07-14 9:10
 */
@Entity
@Table(name = "personBase")
@Data
public class PersonBase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SectionNo;    //	科室编号

    private Integer PersonNo;    //	职工编号
    private String SpellNo;    //	拼音码
    private String PersonName;    //	姓名
    private String AnotherNo;    //	曾用名
    private String PersonSex;    //	性别
    //    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date BirthDate;    //	出生日期

    private String CapacityNo;    //	身份证号
    private Boolean Marry;    //	婚否
    private String NativePlace;    //	籍贯（省市）
    private String nation;    //	民族
    private String BirthPlace;    //	出生地
    private String FinishDate;    //	毕业时间(YYYYMM)
    private String FinishSchool;    //	毕业院校
    private String FamilyAddres;    //	现家庭住址
    private String degree;    //	学位
    private String DegreeDate;    //	获学位时间(YYYYMM)
    private String HighSchooling;    //	最高学历
    private String SchoolName;    //	授予单位
    private String PostNo;    //	现任行政职务
    private String TitleNo;    //	专业技术职称
    private String PostDate;    //	聘任现职时间YYYYMM
    private Double PostWage;    //	职务工资
    private String health;    //	健康情况
    private String InParty;    //	参加何种党派
    private String PortyDate;    //	参加党派时间YYYYMM
    private String InWorkDate;    //	参加工作时间YYYYMM
    private String InZsuDate;    //	来校工作时间YYYYMM
    private String SpecialityDate;    //	从事本专业工作时间YYYYMM
    private String remarks;    //	备注

}
