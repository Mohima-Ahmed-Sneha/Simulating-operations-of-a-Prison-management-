package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Appointment {

    private String inmateID;
    private String date;
    private String time;
    private String reason;

    public Appointment(String inmateID, String date, String reason, String time) {
        this.inmateID = inmateID;
        this.date = date;
        this.reason = reason;
        this.time = time;
    }

    public String getInmateId() {
        return inmateID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getReason() {
        return reason;
    }

}