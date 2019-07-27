package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "uh03StoreOut")
@Data
public class Uh03StoreOut implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer outNo;             //   出库单号

    private Integer mediNo;           //   药品代码

    private String specification;     //   规格

    private String unit;              //   单位

    private Integer unitPrice;       //    单价

    private Integer quantity;         //    数量
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date outDate;             //   出库日期

    private String department;            //     部门

}

