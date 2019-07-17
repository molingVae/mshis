package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "uh03CompanyList")
@Data
public class Uh03CompanyList implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comNo;           //  供应商代码

    private String comName;     // 供应商名称
    private String comAddress;              //  地ַ
    private String contactTel;         //   联系电话
    private String contactPer;         // 联系人
    private String comType;         //  类别
 


}