package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "prescription")
@Data
public class Prescription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personsNo;         // 医疗卡号

    private String mediNo;            //药品代号
    private Integer quantity;          // 数量
    private Integer pay;               //单价
    private Integer mediMoney;        // 金额
    private String unit;               //单位
    private String doctor;             // 医生代号
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date todayDate;           //计价日期
    private String subjectNo;         //门诊科目
    private String opera;              // 计价员号
    private Integer presNumber;       //处方流水号
    private String todayTotalYn;     // 日结标记
    
}
