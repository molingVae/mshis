package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="uh04DayCureExpense")
@Data
  public class Uh04DayCureExpense implements Serializable {
	  @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer patientNo;//住院号
	  private Date cureDate; //日期
	  private  String subjectCode; //科目码
	  private  String ownExpense; //本日发生数
	  private  String outHospitalFlag; //出院否
}
