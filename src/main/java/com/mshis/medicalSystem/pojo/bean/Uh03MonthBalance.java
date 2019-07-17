
package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "uh03MonthBalance")
@Data
public class Uh03MonthBalance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mediNo;           //  药品代码

    private String specification;     //  规格

    private String unit;              //  单位

    private Integer balancePrice;       //   上月结余（均价）

    private Integer balanceAmount;       //   上月结余（数量）

    private Integer inPrice;       //   本月入库(均价)

    private Integer inAmount;       //  本月入库（数量）

    private Integer outPrice;       //   本月出库(均价)

    private Integer outAmount;       //   本月出库（数量）

    private String Month;              //   月份

}