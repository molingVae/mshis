package com.mshis.medicalSystem.pojo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by 小白的PC on 2019/7/19
 */
@Entity
@Table(name = "card")
@Data
public class Card implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//医疗卡号

    private double money;//金额
    private Integer flag;//挂失标致
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creatTime;//创建日期
}
