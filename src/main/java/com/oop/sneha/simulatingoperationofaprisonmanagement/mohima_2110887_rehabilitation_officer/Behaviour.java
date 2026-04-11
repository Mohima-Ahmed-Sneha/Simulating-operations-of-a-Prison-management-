package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Behaviour {

    private final StringProperty inmateID;
    private final StringProperty behaviorNote;

    public Behaviour(String inmateID, String behaviorNote) {
        this.inmateID = new SimpleStringProperty(inmateID);
        this.behaviorNote = new SimpleStringProperty(behaviorNote);
    }

    public String getInmateID() {
        return inmateID.get();
    }

    public String getBehaviorNote() {
        return behaviorNote.get();
    }

    public StringProperty inmateIDProperty() {
        return inmateID;
    }

    public StringProperty behaviorNoteProperty() {
        return behaviorNote;
    }

}
