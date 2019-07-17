package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="familyMember")
@Data
public class FamilyMember implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer personNo;    // ְ职工编号

    private String memberName;     //成员姓名
    private String memberSex; //成员性别
    private Date memberBirthDate; //出生日期
    private String memberParty; //政治面目
    private String memberWorkUnit; //现在工作单位及职务
    private String relation; //与职工关系

}