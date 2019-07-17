package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="paraments")
@Data
public class Paraments implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paramentNo;    // 参数号
    private String paramentValue;     //参数值ֵ
    private String remark; //备注ע
   
}

