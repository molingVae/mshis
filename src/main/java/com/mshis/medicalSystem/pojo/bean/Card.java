package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by 小白的PC on 2019/7/19
 */
@Entity
@Table(name = "card")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private double price;//金额

    private boolean flet;//挂失

    private Date creatTime;//创建日期
}
