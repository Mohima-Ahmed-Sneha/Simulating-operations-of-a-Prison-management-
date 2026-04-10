package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Medical_history {

    private String checkups;
    private String treatments;
    private String prescriptions;
    private String records;

    public Medical_history(String checkups, String treatments, String prescriptions, String records) {
        this.checkups = checkups;
        this.treatments = treatments;
        this.prescriptions = prescriptions;
        this.records = records;
    }

    public String getCheckups() {
        return checkups;
    }

    public void setCheckups(String checkups) {
        this.checkups = checkups;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }

    public String getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(String prescriptions) {
        this.prescriptions = prescriptions;
    }

    public String getRecords() {
        return records;
    }

    public void setRecords(String records) {
        this.records = records;
    }
}
