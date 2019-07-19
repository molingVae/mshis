package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="uh04WordBedSum")
@Data

public class Uh04WardBedSum implements Serializable {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Date totalDate;//日期
	private String validBedNumber;//有效床位数
	private String useBedNumber;//占用床位数
	

}
