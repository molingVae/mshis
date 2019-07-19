package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "uh04HospitalAccount")
@Data
public class Uh04HospitalAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer subjectCode; //科目编码

    private Date accountDate;  //日期
    private String dayMoney;    //本日发生数

}
