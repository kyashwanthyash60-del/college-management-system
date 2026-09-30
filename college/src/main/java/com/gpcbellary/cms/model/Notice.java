package com.gpcbellary.cms.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "notices")
public class Notice {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(length = 4000)
    private String content;
    private String branch;
    private LocalDate publishedDate;
    private String priority;

    public Notice() {}
    public Notice(String title, String content, String branch, LocalDate publishedDate, String priority) {
        this.title=title; this.content=content; this.branch=branch; this.publishedDate=publishedDate; this.priority=priority;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getTitle(){return title;} public void setTitle(String v){title=v;}
    public String getContent(){return content;} public void setContent(String v){content=v;}
    public String getBranch(){return branch;} public void setBranch(String v){branch=v;}
    public LocalDate getPublishedDate(){return publishedDate;} public void setPublishedDate(LocalDate v){publishedDate=v;}
    public String getPriority(){return priority;} public void setPriority(String v){priority=v;}
}
