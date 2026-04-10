package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Prescription {

    private String inmateID;
    private String medsName;
    private String dosage;
    private String frequency;
    private String date;

    public Prescription(String inmateID, String medsName, String dosage, String frequency, String date) {
        this.inmateID = inmateID;
        this.medsName = medsName;
        this.dosage = dosage;
        this.frequency = frequency;
        this.date = date;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public String getMedsName() {
        return medsName;
    }

    public void setMedsName(String medsName) {
        this.medsName = medsName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
