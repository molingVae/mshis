package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "uh04OwnExpense")
@Data
public class Uh04OwnExpense implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientNo; //住院号
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date inHospitalDate; //入院日期
    private String patientName; //姓名
    private String alreadyMoney; //已交金额
    private String payMoney; //支出金额
    private String outHospitalFlag; //出院否
}
