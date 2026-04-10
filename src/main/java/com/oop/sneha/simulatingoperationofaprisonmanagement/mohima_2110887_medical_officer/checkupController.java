package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
public class checkupController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TableView <Checkup>checkUpRecTV;
    @javafx.fxml.FXML
    private TableColumn <Checkup, String>inmateIDTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label symptomsL;
    @javafx.fxml.FXML
    private TextField symptomsTF;
    @javafx.fxml.FXML
    private TableColumn <Checkup,String > symptomsTC;
    @javafx.fxml.FXML
    private Label dateL;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @FXML
    private TableColumn <Checkup, String>dateTC;

    private ArrayList<Checkup> recordList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        inmateIDTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getInmateID()));

        symptomsTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getSymptoms()));

        dateTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getDate()));
    }

    @javafx.fxml.FXML
    public void saveRecOAButton(ActionEvent actionEvent) {


        String inmateId = inmateIDTF.getText();
        String symptoms = symptomsTF.getText();
        LocalDate date = dateDP.getValue();

        // ❌ Validation
        if (inmateId.isEmpty() || symptoms.isEmpty() || date == null) {
            statusL.setText("Invalid: Fill all fields");
            return;
        }

        // 🔍 Dummy inmate verification
        if (!isValidInmate(inmateId)) {
            statusL.setText("Invalid Inmate ID");
            return;
        }

        // ✅ Create CheckUp object
        Checkup record = new Checkup(
                inmateId,
                symptoms,
                date.toString()
        );

        // ✅ Save + display
        recordList.add(record);
        checkUpRecTV.getItems().add(record);


        // ✅ Success message
        statusL.setText("Check-Up Recorded Successfully");

        // 🧼 Clear fields
        inmateIDTF.clear();
        symptomsTF.clear();
        dateDP.setValue(null);
    }



    @FXML
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

    private boolean isValidInmate(String inmateId) {
        return true;
    }

}