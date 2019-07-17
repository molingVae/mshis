package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * description:
 * author: ĭ��
 * create: 2019-07-14 9:10
 */
@Entity
@Table(name = "diagnose")
@Data
public class Diagnose implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String diseaseIcd9; //ICD-9编码

    private String diseaseCode; //拼音码

    private String diseaseType; //疾病分类码

    private String diseaseName; //疾病名称

}



