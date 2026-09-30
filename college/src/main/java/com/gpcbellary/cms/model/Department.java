package com.gpcbellary.cms.model;

import jakarta.persistence.*;

@Entity
@Table(name = "departments")
public class Department {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String code;
    private String name;
    private String hodName;
    private String description;

    public Department() {}
    public Department(String code, String name, String hodName, String description) {
        this.code=code; this.name=name; this.hodName=hodName; this.description=description;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getCode(){return code;} public void setCode(String v){code=v;}
    public String getName(){return name;} public void setName(String v){name=v;}
    public String getHodName(){return hodName;} public void setHodName(String v){hodName=v;}
    public String getDescription(){return description;} public void setDescription(String v){description=v;}
}
