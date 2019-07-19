package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "uh03StoreIn")
@Data
public class Uh03StoreIn implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inNo;             //   入库单号

    private Integer mediNo;           //  药品代码
    private String specification;     //  规格
    private String unit;              //   单位
    private Integer unitPrice;       //   单价
    private Integer quantity;         //   数量
    private Date inDate;             //   日期
    private String comNo;            //   供应商代号
    private String billNo;           //    发票号码
}
