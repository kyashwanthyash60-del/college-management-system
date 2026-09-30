package com.gpcbellary.cms.model;
import jakarta.persistence.*; import java.math.BigDecimal;
@Entity @Table(name="results") public class Result {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String academicYear,examName,usn,studentName,branch,resultStatus; private BigDecimal percentage;
 public Result(){} public Long getId(){return id;} public void setId(Long v){id=v;} public String getAcademicYear(){return academicYear;} public void setAcademicYear(String v){academicYear=v;} public String getExamName(){return examName;} public void setExamName(String v){examName=v;} public String getUsn(){return usn;} public void setUsn(String v){usn=v;} public String getStudentName(){return studentName;} public void setStudentName(String v){studentName=v;} public String getBranch(){return branch;} public void setBranch(String v){branch=v;} public BigDecimal getPercentage(){return percentage;} public void setPercentage(BigDecimal v){percentage=v;} public String getResultStatus(){return resultStatus;} public void setResultStatus(String v){resultStatus=v;}
}
