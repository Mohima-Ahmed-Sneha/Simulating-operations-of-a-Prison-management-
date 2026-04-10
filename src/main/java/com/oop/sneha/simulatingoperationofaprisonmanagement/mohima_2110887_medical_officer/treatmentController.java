package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.util.ArrayList;

public class treatmentController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TextArea currentPlanTA;
    @javafx.fxml.FXML
    private ComboBox <String>treatmentModfCB;
    @javafx.fxml.FXML
    private TableColumn <Treatment, String> treatmentModfTC;
    @javafx.fxml.FXML
    private Label inmateIDlL;
    @javafx.fxml.FXML
    private TableColumn <Treatment, String>inmateIDTC;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label treatmentModfL;
    @javafx.fxml.FXML
    private TableColumn <Treatment, String>statusTC;
    @javafx.fxml.FXML
    private TableView <Treatment> updatedPlanTV;
    @javafx.fxml.FXML
    private Label currentPlanL;
    @javafx.fxml.FXML
    private TableColumn <Treatment, String>currentPlanTC;

    private ObservableList<Treatment> treatmentList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {
        updatedPlanTV.setItems(treatmentList);

        treatmentModfCB.getItems().addAll(
                "Medication Change",
                "Dosage Increase",
                "Therapy Update",
                "Observation",
                "Discharge Plan"
        );

        // Table columns
        inmateIDTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getInmateID()));

        currentPlanTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getCurrentPlan()));

        treatmentModfTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getModification()));

        statusTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getStatus()));


    }

    @javafx.fxml.FXML
    public void updateOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        String modification = treatmentModfCB.getValue();
        String currentPlan = currentPlanTA.getText();

        // ❌ Validation
        if (inmateId.isEmpty() || modification == null || currentPlan.isEmpty()) {
            statusL.setText("Invalid: Fill all fields");
            return;
        }

        // 🔍 Check active treatment (dummy logic)
        if (!isActiveTreatment(inmateId)) {
            statusL.setText("No active treatment plan found");
            return;
        }

        // 📌 Create update object
        Treatment update = new Treatment(
                inmateId,
                currentPlan,
                modification,
                "UPDATED"
        );

        // 💾 Store + display
        treatmentList.add(update);
        updatedPlanTV.setItems(treatmentList);
        updatedPlanTV.refresh();

        // 📄 Show summary
        statusL.setText("Treatment Plan Updated Successfully");

        // 🧼 Clear inputs
        inmateIDTF.clear();
        currentPlanTA.clear();
        treatmentModfCB.setValue(null);
    }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_medical_officer/medical_officer_dashboard.fxml"));
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Medical Officer");
        stage.show();

    }

    private boolean isActiveTreatment(String inmateId) {
        return inmateId.startsWith("IN"); // simple rule for now
    }

}