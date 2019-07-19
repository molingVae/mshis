package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "checkStandard")
@Data
public class CheckStandard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer checkNo;   // 检查项目代号

    private String checkName; // 名称
    private Integer checkPay; // 价格
    private String checkUnit; // 单位
    private String checkType; // 类型
    
    
}
