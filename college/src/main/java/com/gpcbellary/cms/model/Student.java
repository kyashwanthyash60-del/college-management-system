package com.gpcbellary.cms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String usn;
    private String name;
    private String branch;
    private Integer semester;
    private String phone;
    private String email;
    private String admissionYear;

    public Student() {}
    public Student(String usn, String name, String branch, Integer semester, String phone, String email, String admissionYear) {
        this.usn = usn; this.name = name; this.branch = branch; this.semester = semester;
        this.phone = phone; this.email = email; this.admissionYear = admissionYear;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getUsn(){return usn;} public void setUsn(String v){usn=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getBranch(){return branch;} public void setBranch(String v){branch=v;}
    public Integer getSemester(){return semester;} public void setSemester(Integer v){semester=v;}
    public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
    public String getAdmissionYear(){return admissionYear;} public void setAdmissionYear(String v){admissionYear=v;}
}
