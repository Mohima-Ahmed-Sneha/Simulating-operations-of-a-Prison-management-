package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Emergency {

    private String inmateID;
    private String type;
    private String action;

    public Emergency(String inmateID, String type, String action) {
        this.inmateID = inmateID;
        this.type = type;
        this.action = action;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
