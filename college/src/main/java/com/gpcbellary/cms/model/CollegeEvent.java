package com.gpcbellary.cms.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "college_events")
public class CollegeEvent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(length = 2000)
    private String description;
    private String branch;
    private LocalDate eventDate;
    private String venue;
    private String coordinator;

    public CollegeEvent() {}
    public CollegeEvent(String title, String description, String branch, LocalDate eventDate, String venue, String coordinator) {
        this.title=title; this.description=description; this.branch=branch; this.eventDate=eventDate;
        this.venue=venue; this.coordinator=coordinator;
    }
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getTitle(){return title;} public void setTitle(String v){title=v;}
    public String getDescription(){return description;} public void setDescription(String v){description=v;}
    public String getBranch(){return branch;} public void setBranch(String v){branch=v;}
    public LocalDate getEventDate(){return eventDate;} public void setEventDate(LocalDate v){eventDate=v;}
    public String getVenue(){return venue;} public void setVenue(String v){venue=v;}
    public String getCoordinator(){return coordinator;} public void setCoordinator(String v){coordinator=v;}
}
