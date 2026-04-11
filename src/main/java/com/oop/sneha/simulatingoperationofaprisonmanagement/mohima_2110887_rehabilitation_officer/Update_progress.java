package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

public class Update_progress {

    private String inmateID;
    private String programmeID;
    private String attendance;
    private String score;
    private String grade;

    public Update_progress(String inmateID, String programmeID, String attendance, String score, String grade) {
        this.inmateID = inmateID;
        this.programmeID = programmeID;
        this.attendance = attendance;
        this.score = score;
        this.grade = grade;
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

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
