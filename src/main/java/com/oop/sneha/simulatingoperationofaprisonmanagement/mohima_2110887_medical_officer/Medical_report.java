package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

public class Medical_report {

    private String inmateID;
    private String fromDate;
    private String toDate;
    private String reportDetails;

    public Medical_report(String inmateID, String fromDate, String toDate, String reportDetails) {
        this.inmateID = inmateID;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reportDetails = reportDetails;
    }

    public String getInmateID() {
        return inmateID;
    }

    public void setInmateID(String inmateID) {
        this.inmateID = inmateID;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    public void setReportDetails(String reportDetails) {
        this.reportDetails = reportDetails;
    }
}
