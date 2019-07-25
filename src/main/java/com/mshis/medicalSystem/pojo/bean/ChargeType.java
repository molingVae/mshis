package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
//收费类型代码表
@Entity
@Table(name = "chargeType")
@Data
public class ChargeType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer chargeNo;    //收费类型代码

    private String chargeName; //收费类型名称
    private Integer chargeStandard1;    //门诊收费标准
    private Integer chargeStandard2;    //住院收费标准


}
