package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class trainingController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private Label summaryStatusL;
    @javafx.fxml.FXML
    private TextField trainingIDTF;
    @javafx.fxml.FXML
    private Label alertstatusL;

    @javafx.fxml.FXML
    public void initialize() {
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

    @javafx.fxml.FXML
    public void assignTrainingOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        String trainingId = trainingIDTF.getText();


        if (inmateId.isBlank() || trainingId.isBlank()) {
            alertstatusL.setText("Please fill all fields!");
            summaryStatusL.setText("");
            return;
        }


        boolean trainingAvailable = true;   // assume available
        boolean inmateEligible = true;      // assume eligible


        if (!trainingAvailable) {
            alertstatusL.setText("Training not available!");
            summaryStatusL.setText("");
            return;
        }

        if (!inmateEligible) {
            alertstatusL.setText("Inmate not eligible!");
            summaryStatusL.setText("");
            return;
        }


        alertstatusL.setText("Training Assigned Successfully!");

        summaryStatusL.setText(
                "Inmate " + inmateId +
                        " assigned to Training " + trainingId
        );


        inmateIDTF.clear();
        trainingIDTF.clear();

    }
}