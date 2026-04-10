package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Treatment {

    private String inmateID;
    private String currentPlan;
    private String modification;
    private String status;

    public Treatment(String inmateID, String currentPlan, String modification, String status) {
        this.inmateID = inmateID;
        this.currentPlan = currentPlan;
        this.modification = modification;
        this.status = status;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public String getCurrentPlan() {
        return currentPlan;
    }

    public void setCurrentPlan(String currentPlan) {
        this.currentPlan = currentPlan;
    }

    public String getModification() {
        return modification;
    }

    public void setModification(String modification) {
        this.modification = modification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
