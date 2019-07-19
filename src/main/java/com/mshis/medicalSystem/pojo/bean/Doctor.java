package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="doctor")
@Data
public class Doctor implements Serializable {
	       
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer doctorNo;//医生代号

	private String doctorName;//医生名称
	private Integer subjectNo;//科室代号
	private String subjectName;//科室名称
	private Integer subjectNo1;//兼科代号
	private Integer personNo;//工资代号
	

}
