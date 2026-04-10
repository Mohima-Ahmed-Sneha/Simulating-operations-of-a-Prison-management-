package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.fxml.FXML;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class prescriptionController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TableColumn <Prescription, String> inmateIDTC;
    @javafx.fxml.FXML
    private Label InmateIDL;
    @javafx.fxml.FXML
    private TextField dosageTF;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private TextField frequencyTF;
    @javafx.fxml.FXML
    private TableColumn <Prescription, String> medsNameTC;
    @javafx.fxml.FXML
    private TableColumn <Prescription, String>dosageTC;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableView <Prescription> updatedTV;
    @javafx.fxml.FXML
    private TableColumn <Prescription, String>  frequencyTC;
    @javafx.fxml.FXML
    private TextField medsNameTF;

    private ObservableList<Prescription> prescriptionList =
            FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {

        updatedTV.setItems(prescriptionList);

        inmateIDTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getInmateID()));

        medsNameTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getMedsName()));

        dosageTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getDosage()));

        frequencyTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getFrequency()));

    }

    @javafx.fxml.FXML
    public void updateOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        String meds = medsNameTF.getText();
        String dosage = dosageTF.getText();
        String frequency = frequencyTF.getText();
        LocalDate date = dateDP.getValue();

        // ❌ Validation
        if (inmateId.isEmpty() || meds.isEmpty() || dosage.isEmpty()
                || frequency.isEmpty() || date == null) {
            statusL.setText("Invalid: Fill all fields");
            return;
        }

        // 🔍 Validate dosage (simple rule)
        if (!isValidDosage(dosage)) {
            statusL.setText("Invalid dosage format");
            return;
        }

        // 📌 Create object
        Prescription prescription = new Prescription(
                inmateId,
                meds,
                dosage,
                frequency,
                date.toString()
        );

        // 💾 Store + display
        prescriptionList.add(prescription);

        statusL.setText("Prescription Added Successfully");

        // 🧼 Clear inputs
        inmateIDTF.clear();
        medsNameTF.clear();
        dosageTF.clear();
        frequencyTF.clear();
        dateDP.setValue(null);

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

    private boolean isValidDosage(String dosage) {
        // simple rule: must contain numbers (e.g. 500mg)
        return dosage.matches(".*\\d+.*");
    }
}