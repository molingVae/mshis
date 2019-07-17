package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="subject")
@Data
public class Subject implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sCode;//科目码

	private String  sName;//科目名称
}
