package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * description: 手术情况
 * author: 沫凌
 * create: 2019-07-14 9:10
 */
@Entity
@Table(name = "operation")
@Data
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer operationNum;    //	病案号(YYYY9999)

    private Integer operationTimes; //第几次入院

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date operationDate;     //手术日期
    private String operationName;     //手术名称
    private String operationCode;      //操作编码
    private String operationHocus; //麻醉
    private String operationCut; //切口
    private String operationDoctorName;    //手术医师

}
