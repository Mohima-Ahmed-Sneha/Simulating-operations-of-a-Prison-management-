package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import java.time.LocalDate;

public class Session {

    private String inmateID;
    private LocalDate date;
    private String time;
    private String counsellorName;

    public Session(String inmateID, LocalDate date, String time, String counsellorName) {
        this.inmateID = inmateID;
        this.date = date;
        this.time = time;
        this.counsellorName = counsellorName;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCounsellorName() {
        return counsellorName;
    }

    public void setCounsellorName(String counsellorName) {
        this.counsellorName = counsellorName;
    }

    public String getDetails() {
        return "=== Counselling Session ===\n\n"
                + "Inmate ID: " + inmateID + "\n"
                + "Date: " + date + "\n"
                + "Time: " + time + "\n"
                + "Counsellor: " + counsellorName;
    }
}
