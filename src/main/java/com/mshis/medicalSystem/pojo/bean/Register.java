package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 小白的PC on 2019/7/18
 */
@Entity
@Table(name = "register")
@Data
public class Register implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer registerId;//挂号id

    private Integer doctorNo;//医生代号
    private Integer personsNo;//挂号医疗卡号
    private Integer sectionNo;  // 挂号科室
    private String patientName; //挂号姓名
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date  registerDate;//挂号时间
    private Integer registerPrice;//挂号费用

}
