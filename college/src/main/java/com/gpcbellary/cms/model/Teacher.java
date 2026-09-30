package com.gpcbellary.cms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String employeeId;
    private String name;
    private String department;
    private String designation;
    private String phone;
    private String email;

    public Teacher() {}
    public Teacher(String employeeId, String name, String department, String designation, String phone, String email) {
        this.employeeId=employeeId; this.name=name; this.department=department; this.designation=designation;
        this.phone=phone; this.email=email;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getEmployeeId(){return employeeId;} public void setEmployeeId(String v){employeeId=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getDepartment(){return department;} public void setDepartment(String v){department=v;}
    public String getDesignation(){return designation;} public void setDesignation(String v){designation=v;}
    public String getPhone(){return phone;} public void setPhone(String v){phone=v;}
    public String getEmail(){return email;} public void setEmail(String v){email=v;}
}
