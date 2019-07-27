package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "treat")
@Data
public class Treat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personsNo;        // 医疗卡号
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date treatDate;          //看病日期
    private Integer mediTotal;       //  药费总额
    private Integer percentage;       //  应扣百分比
    private String mediType;         //   药品种类
    private String opera;             //  挂号员号
    private String registerYn;       //   挂号标记
    private Integer presNumber;      //  打印标记
    private Integer printNumber;     //   处方流水号
}
