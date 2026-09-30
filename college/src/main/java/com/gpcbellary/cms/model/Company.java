package com.gpcbellary.cms.model;
import jakarta.persistence.*;
@Entity @Table(name="placement_companies") public class Company {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String companyName,jobRole,location,eligibility,contactPerson,contactEmail,status;
 public Company(){} public Long getId(){return id;} public void setId(Long v){id=v;} public String getCompanyName(){return companyName;} public void setCompanyName(String v){companyName=v;} public String getJobRole(){return jobRole;} public void setJobRole(String v){jobRole=v;} public String getLocation(){return location;} public void setLocation(String v){location=v;} public String getEligibility(){return eligibility;} public void setEligibility(String v){eligibility=v;} public String getContactPerson(){return contactPerson;} public void setContactPerson(String v){contactPerson=v;} public String getContactEmail(){return contactEmail;} public void setContactEmail(String v){contactEmail=v;} public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
