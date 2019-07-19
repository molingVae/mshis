package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
//各类收费标准表

@Entity
@Table(name="standardExpense")
@Data
public class StandardExpense implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String expenseItem; //收费项目
    private String expenseCode;    //收费编号
    private String expenseName;    //收费名称
    private String unitPrice;    //单价
    private String gaugeUnit;    //计量单位
    private String expense;    //收费标准
}
