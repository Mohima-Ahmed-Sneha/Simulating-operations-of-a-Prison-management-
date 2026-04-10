package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

public class medical_historyController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TableColumn <Medical_history, String> checkupsTC;
    @javafx.fxml.FXML
    private TableColumn <Medical_history, String> treatmentsTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private TableColumn <Medical_history, String> recordstc;
    @javafx.fxml.FXML
    private TableColumn <Medical_history, String> prescriptionTC;
    @javafx.fxml.FXML
    private TableView <Medical_history> historyTV;

    private ObservableList<Medical_history> historyList = FXCollections.observableArrayList();

    // 🔹 Fake database (simulate records)
    private HashMap<String, ObservableList<Medical_history>> database = new HashMap<>();

    @javafx.fxml.FXML
    public void initialize() {

        historyTV.setItems(historyList);

        // Column mapping
        checkupsTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getCheckups()));

        treatmentsTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getTreatments()));

        prescriptionTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getPrescriptions()));

        recordstc.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getRecords()));

        // 🔹 Dummy data
        ObservableList<Medical_history> inmate1 = FXCollections.observableArrayList(
                new Medical_history("3 Checkups", "Pain management", "Paracetamol", "Stable"),
                new Medical_history("Follow-up", "Wound care", "Antibiotics", "Recovering")
        );

        database.put("IN001", inmate1);

    }

    @javafx.fxml.FXML
    public void loadHistoryOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();

        if (inmateId.isEmpty()) {
            statusL.setText("Please enter inmate ID");
            return;
        }

        if (!database.containsKey(inmateId)) {
            statusL.setText("No medical history found");
            historyTV.getItems().clear();
            return;
        }

        // 🔹 Load data
        ObservableList<Medical_history> records = database.get(inmateId);
        historyList.setAll(records);

        statusL.setText("Medical History Loaded Successfully");

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
}