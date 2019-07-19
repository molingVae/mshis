package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="userAuth")
@Data
public class UserAuth implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String subSystemName;    // 子系统名
    private String userName;     //用户名
    private String passworde; //口令
    private String userLevel; //用户级别
    private String remark; //备注ע
}
