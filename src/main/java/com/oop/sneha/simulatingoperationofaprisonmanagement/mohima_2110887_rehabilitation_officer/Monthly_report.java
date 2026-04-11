package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

public class Monthly_report {

    private String month;
    private int year;
    private String reportContent;

    public Monthly_report(String month, int year) {
        this.month = month;
        this.year = year;
        generateReport();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    private void generateReport() {
        this.reportContent = "=== Monthly Report ===\n\n"
                + "Month: " + month + "\n"
                + "Year: " + year + "\n\n"
                + "Rehabilitation activities completed.\n"
                + "Prisoner progress monitored.\n"
                + "No major incidents reported.";
    }

}
