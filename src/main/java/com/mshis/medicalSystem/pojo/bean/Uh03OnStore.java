package com.mshis.medicalSystem.pojo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "uh03OnStore")
@Data
@AllArgsConstructor
public class Uh03OnStore implements Serializable {

    public Uh03OnStore() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mediNo;           //   药品代码

    private String specification;     //   规格

    private String unit;              //    单位

    private Integer unitPrice;       //    单价

    private Integer quantity;         //    数量

}