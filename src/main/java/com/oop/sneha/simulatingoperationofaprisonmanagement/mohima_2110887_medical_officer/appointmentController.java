package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class appointmentController
{
    @javafx.fxml.FXML
    private ComboBox <String> timeCB;
    @javafx.fxml.FXML
    private Label appListL;
    @javafx.fxml.FXML
    private Label timeL;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn <Appointment, String> dateTC;
    @javafx.fxml.FXML
    private TableColumn <Appointment, String> timeTC;
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private Label dateL;
    @javafx.fxml.FXML
    private TableColumn <Appointment, String> inmateIDTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private TableView <Appointment> appListTV;
    @javafx.fxml.FXML
    private TableColumn <Appointment,String> reasonTC;

    private ArrayList<Appointment> appointmentList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label reasonL;
    @javafx.fxml.FXML
    private TextArea reasonTA;

    @javafx.fxml.FXML
    public void initialize() {

        inmateIDTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getInmateId()));

        dateTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getDate()));

        timeTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getTime()));

        reasonTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getReason()));

        reasonTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getReason()));

        // Time options
        timeCB.getItems().addAll("09:00", "10:00", "11:00", "12:00");


    }

    @javafx.fxml.FXML
    public void selectAppOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        LocalDate date = dateDP.getValue();
        String time = (String) timeCB.getValue();
        String reason = reasonTA.getText();

        // Check empty fields
        if (inmateId.isEmpty() || date == null || time == null) {
            statusL.setText("Invalid: Fill all fields");
            return;
        }

        //  Check past date
        if (date.isBefore(LocalDate.now())) {
            statusL.setText("Invalid: Date is in the past");
            return;
        }

        //  Check time conflict
        for (Appointment a : appointmentList) {
            if (a.getDate().equals(date.toString()) &&
                    a.getTime().equals(time)) {

                statusL.setText("Invalid: Time slot already booked");
                return;
            }
        }

        // ✅ Create appointment (reason = empty)
        Appointment newApp = new Appointment(
                inmateId,
                date.toString(),
                time,
                reason
        );

        // Save + display
        appointmentList.add(newApp);
        appListTV.getItems().add(newApp);

        // Success message
        statusL.setText("Appointment Scheduled Successfully");

        // Clear inputs
        inmateIDTF.clear();
        dateDP.setValue(null);
        timeCB.setValue(null);
        reasonTA.clear();
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