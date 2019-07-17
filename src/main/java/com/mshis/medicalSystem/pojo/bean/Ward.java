package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
//床位登记表
@Entity
@Table(name = "ward")
@Data
public class Ward implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bedNo;    //床号

    private String section;  //科别
    private String patientName;    //姓名
    private String patientSex;    //性别
}
