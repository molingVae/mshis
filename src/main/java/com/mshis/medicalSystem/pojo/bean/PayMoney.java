package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
//病人预交款情况登记表
@Entity
@Table(name="payMoney")
@Data
public class PayMoney implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientNo;    //住院号

    private Date paydate;    //交款日期
    private String patientName; //病人姓名
    private String money;  //预交款
    private String outFlag;    //出院否
    private Date outDate;  //出院日期
}
