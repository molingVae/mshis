package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "uh04LongRecipe")
@Data
public class Uh04LongRecipe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //住院号
    private Integer patientNo; //住院号

    private Date startTime; //开始时间
    private Date stopTime;   //ֹͣ停止时间
    private String sectionCode; //科室代码
    private String cureType;//收费类别
    private String medicineCode;//药品代码
    private String medicineName;//药品名称
    private String medicineUse;//药品用法
    private String medicineNum;//药品用量
    private String medicineGauge;//药品规格
    private String imtervalTime;//用药时间
    private String imtervalDate;//隔天数
    private String unitPrice;//单价
    private String exponse;//费用
    private String quality;//费用性质
    private String yCode;//医生编码
    private String hCode;//护士编码
    private String writeAccountFlag;//记帐标志־
    private String outFlag;//出院否

}
