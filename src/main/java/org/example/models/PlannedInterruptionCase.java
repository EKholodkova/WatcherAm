package org.example.models;

import javax.persistence.*;

@Entity
@Table(name = "planned_interruptions")
public class PlannedInterruptionCase {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="address")
    private String address;

    @Column(name="start_date")
    private String startDate;

    @Column(name="ending_date")
    private String endingDate;

    @Column(name="start_time")
    private String startTime;

    @Column(name="ending_time")
    private String endingTime;

    public PlannedInterruptionCase() {}

    public PlannedInterruptionCase(String address, String startDate, String endingDate, String startTime, String endingTime) {
        this.address = address;
        this.startDate = startDate;
        this.endingDate = endingDate;
        this.startTime = startTime;
        this.endingTime = endingTime;
    }

    public String getAddress() {
        return address;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndingTime() {
        return endingTime;
    }

    public int getId() {
        return id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndingTime(String endingTime) {
        this.endingTime = endingTime;
    }

    public void setId(int id) {
        this.id = id;
    }
}
