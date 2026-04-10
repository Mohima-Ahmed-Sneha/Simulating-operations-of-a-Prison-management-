package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Checkup {

    private String inmateID;
    private String symptoms;
    private String date;

    public Checkup(String inmateID, String symptoms, String date) {
        this.inmateID = inmateID;
        this.symptoms = symptoms;
        this.date = date;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
