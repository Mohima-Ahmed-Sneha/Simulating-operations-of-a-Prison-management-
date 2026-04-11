package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

public class Enroll_inmate {

    private String inmateId;
    private String programmeId;
    private String date;

    public Enroll_inmate(String inmateId, String programmeId, String date) {
        this.inmateId = inmateId;
        this.programmeId = programmeId;
        this.date = date;
    }

    public String getInmateId() {
        return inmateId;
    }

    public void setInmateId(String inmateId) {
        this.inmateId = inmateId;
    }

    public String getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(String programmeId) {
        this.programmeId = programmeId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
