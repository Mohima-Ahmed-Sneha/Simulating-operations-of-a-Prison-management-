package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class behaviourController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private Label summaryStatusL;
    @javafx.fxml.FXML
    private TextArea behaviorTA;
    @javafx.fxml.FXML
    private Label alertstatusL;

    private final ObservableList<Behaviour> behaviourList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        summaryStatusL.setText("");
        alertstatusL.setText("");

    }

    @javafx.fxml.FXML
    public void submitOAButton(ActionEvent actionEvent) {

        String inmateID = inmateIDTF.getText();
        String note = behaviorTA.getText();


        if (note == null || note.trim().isEmpty()) {
            alertstatusL.setText("Behaviour note cannot be empty!");
            summaryStatusL.setText("");
            return;
        }


        if (inmateID == null || inmateID.trim().isEmpty()) {
            alertstatusL.setText("Please enter inmate ID!");
            summaryStatusL.setText("");
            return;
        }


        Behaviour behaviour = new Behaviour(inmateID, note);
        behaviourList.add(behaviour);


        int score = note.length();


        summaryStatusL.setText("Observation recorded successfully! Score: " + score);
        alertstatusL.setText("");


        inmateIDTF.clear();
        behaviorTA.clear();

    }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_rehabilitation_officer/ro_dashboard.fxml")
            );

            Parent root = loader.load();

            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}