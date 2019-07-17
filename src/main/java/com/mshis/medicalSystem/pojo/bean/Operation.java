package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 手术情况表
 *
 * @author Administrator
 */

@Entity
@Table(name = "operation")
@Data
public class Operation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OperationNum;    //	病案号(YYYY9999)

    private Integer OperationTimes; //第几次入院
    private Date OperationDate;     //手术日期
    private String OperationName;     //手术名称
    private String OperationCode;      //操作编码
    private String OperationHocus; //麻醉
    private String OperationCut; //切口
    private String OperationDoctorName;    //手术医师

}
