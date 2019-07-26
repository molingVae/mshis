package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "spouseBase")
@Data
public class SpouseBase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personNo;      //职工编号 ְ

    private String spouseName;     //爱人姓名
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date spouseBirthDate; //爱人出生日期
    private String spouseParty; //爱人政治面貌
    private String spouseSchooling; //爱人学历
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date marryDate; //何时结婚
    private String workUnit; //爱人工作单位及职务
    private String spouseNative; //爱人籍贯
    private String workQuality; //编制属性
    private Boolean cadre; //干部否

}