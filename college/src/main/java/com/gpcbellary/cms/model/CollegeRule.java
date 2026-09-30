package com.gpcbellary.cms.model;
import jakarta.persistence.*;
@Entity @Table(name="college_rules") public class CollegeRule {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; private String category,title; @Column(length=4000) private String description;
 public CollegeRule(){} public Long getId(){return id;} public void setId(Long v){id=v;} public String getCategory(){return category;} public void setCategory(String v){category=v;} public String getTitle(){return title;} public void setTitle(String v){title=v;} public String getDescription(){return description;} public void setDescription(String v){description=v;}
}
