package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "uh03Price")
@Data
public class Uh03Price implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mediNo;           //  药品代码

    private String specification;     //   规格
    private String unit;              //    单位
    private Integer unitPrice;       //    单价
    private String mediName;         //    品名
    private String quality;         //    性质
    private Integer storeLimit;       //     库存下限

}