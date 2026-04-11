package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

public class Requests {
    private String requestID;
    private String inmateID;
    private String programmeID;
    private String status;

    public Requests(String requestID, String inmateID, String programmeID, String status) {
        this.requestID = requestID;
        this.inmateID = inmateID;
        this.programmeID = programmeID;
        this.status = status;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public String getProgrammeID() {
        return programmeID;
    }

    public void setProgrammeID(String programmeID) {
        this.programmeID = programmeID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
