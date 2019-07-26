package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "dayMoney")
@Data
public class DayMoney implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personsNo;       //  医疗卡号
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dayDate;           //追加日期
    private Integer dayMoney;       //  金额
    private Integer daySup;         //  余额
    private String opera;            //  操作员号
}
