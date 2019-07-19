package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="section")
@Data
public class Section implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sectionNo;    // 科室编码

    private String sectionName;     //科室名称
}