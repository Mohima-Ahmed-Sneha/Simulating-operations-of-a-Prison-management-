package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class View_history {

    private final StringProperty inmateID;
    private final StringProperty programmeID;
    private final StringProperty attendance;
    private final DoubleProperty score;
    private final StringProperty grade;

    public View_history(String inmateID, String programmeID, String attendance, double score, String grade) {
        this.inmateID = new SimpleStringProperty(inmateID);
        this.programmeID = new SimpleStringProperty(programmeID);
        this.attendance = new SimpleStringProperty(attendance);
        this.score = new SimpleDoubleProperty(score);
        this.grade = new SimpleStringProperty(grade);
    }

    public StringProperty inmateIDProperty() { return inmateID; }
    public StringProperty programmeIDProperty() { return programmeID; }
    public StringProperty attendanceProperty() { return attendance; }
    public DoubleProperty scoreProperty() { return score; }
    public StringProperty gradeProperty() { return grade; }

}
