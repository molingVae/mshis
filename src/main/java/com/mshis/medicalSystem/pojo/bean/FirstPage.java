package com.mshis.medicalSystem.pojo.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 * 病案
 * @author Administrator
 *
 */
@Entity
@Table(name = "firstPage")
@Data
public class FirstPage implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer fgNum;	//	*病案号(YYYY9999)

	private Integer fgTimes;	//	第几次入院
	private String fgName;	//	*姓名
	private String fgSex;	//	*性别
	private Date fgBirthday;	//	*出生日期
	private boolean fgMarriage;	//	*婚姻状况
	private String fgOccupation;	//	*职业
	private String fgBirthplace;	//	*籍贯
	private String fgNationality;	//	*国籍
	private String fgIDNum;	//	*身份证号
	private String fgNnit;	//	*工作单位或地址
	private String fgPhonenum;	//	 本人电话
	private String fgUnitPostalcodet;	//	 工作单位邮编
	private String fgAddress;	//	*户口地址
	private String fgHomePostalcode;	//	 居住地邮编
	private String fgLinkmanName;	//	*联系人
	private String fgLinkmanRelation;	//	*关系
	private String fgLinkmanAddress;	//	 联系人地址
	private String fgLinkmanPhonenum;	//	*联系人电话
	private String fgDepartment;	//	*入院科别
	private String fgRoom;	//	*入院病室
	private Date fgInTime;	//	*入院日期时间
	private String fgInStatus;	//	入院时情况
	private String fgPayway;	//	*交费方式
	private String fgChangedepartment;	//	转科情况
	private String fgOutDepartment;	//	出院科别
	private String fgOutRoom;	//	出院病室
	private Date fgOutDate;	//	出院日期
	private String fgOutDiagnose;	//	门诊诊断
	private String fgOutDiagnoseCode;	//	门诊诊断编码
	private String fgInDiagnose;	//	入院诊断
	private String fgInDiagnoseCode;	//	入院诊断编码
	private Date fgDiagnoseDate;	//	确诊日期
	private String fgMainDiagnose;	//	主要诊断
	private String fgMainDiagnoseCode;	//	主要诊断编码
	private String fgSubordinationDiagnose;	//	其他诊断
	private String fgSubordinationDiagnoseCode;	//	其他诊断编码
	private String fgIntercurrentDisease;	//	并发症
	private String fgIntercurrentDiseaseCode;	//	并发症编码
	private String fgOutStatus;	//	出院情况
	private String fgNameInfect;	//	院内感染名称
	private String fgOuterReasonMarAndToxicosis;	//	损伤和中毒的外部原因
	private String fgPathologicDiagnose;	//	病理诊断
	private String fgAllergicMedicament;	//	过敏药物
	private String fgBloodType;	//	血型
	private String fgDiseaseCaseQuality;	//	病案质量
	private Integer fgTimesSave;	//	抢救次数
	private Integer fgTimesSuccess;	//	成功次数
	private boolean fg_followDiagnose;	//	随诊
	private Date fgFollowDiagnoseLimit;	//	随诊期限
	private boolean fgAshesCheck;	//	尸检
	private double fgTotalCharge;	//	住院费用总计
	private Integer fgBedCharge;	//	*床位
	private double fgWesternMedicineCharge;	//	*西药
	private double fgChineseMedicineCharge;	//	*中药
	private Integer fgCheckCharge;	//	*检查
	private Integer fgCureCharge;	//	*治疗
	private Integer fgRadiateCharge;	//	*放射
	private Integer fgOperationCharge;	//	*手术
	private double fgAssayCharge;	//	*化验
	private Integer fgTransfuseCharge;	//	*输血
	private double fgOxygenTherapyCharge;	//	*输氧
	private Integer fgAccoucheCharge;	//	*接生
	private double fgRestCharge;	//	*其他
	private String fgWholeNum;	//	*统筹号
	private Integer fgIndividualShares;	//	*个人分担（%）
	private String fgCheckoutWay;	//	*结帐方式
	private boolean fgLeaveHospital;	//	*出院否
	private boolean fgShowDiseasecase;	//	示教病例
	private String fgSignatureDirectorDoctor;	//	主任医师签名
	private String fgSignatureChargeDoctor;	//	主治医师签名
	private String fgSignatureHouseDoctor;	//	住院医师签名
	private String fgSignatureIntern;	//	实习医师签名
	private String fgSignatureCoder_;	//	编码员签名


}
