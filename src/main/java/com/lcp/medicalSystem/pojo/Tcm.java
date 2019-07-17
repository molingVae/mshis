package com.lcp.medicalSystem.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * description:
 * author: 沫凌
 * create: 2019-07-14 9:10
 */
@Entity
@Table(name = "tcm")
@Data
public class Tcm implements Serializable {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String sp; //简介
    private String name; //中药名
    private String alias; //别名
    private String englishname; //英文名
    private String source; //来源
    private String shape; //形态
    private String distributed; //产地分布
    private String machining; //采收加工
    private String traits; //药材性状
    private String sexualtaste; //性味归经
    private String efficacy; //功效与作用
    private String clinical; //临床应用
    private String pharmacology; //药理研究
    private String ingredient; //化学成分
    private String taboo; //使用禁忌
    private String prescription; //配伍药方
    private String image; //图片
}
