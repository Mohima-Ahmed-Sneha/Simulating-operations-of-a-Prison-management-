package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;


public class medical_reportController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label reportsL;
    @javafx.fxml.FXML
    private Label endDateL;
    @javafx.fxml.FXML
    private Label startDateL;
    @javafx.fxml.FXML
    private TextArea reportsTA;
    @javafx.fxml.FXML
    private DatePicker startDateDP;

    private ArrayList<Medical_report> medicalreportList = new ArrayList<>();
    @javafx.fxml.FXML
    private Label statusL;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/login.fxml"));
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

    @javafx.fxml.FXML
    public void generateReportOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        String fromDate = (startDateDP.getValue() != null) ? startDateDP.getValue().toString() : null;
        String toDate = (endDateDP.getValue() != null) ? endDateDP.getValue().toString() : null;


        if (inmateId.isEmpty() || fromDate == null || toDate == null) {
            statusL.setText("Invalid: Fill all fields");
            return;
        }


        if (!isValidInmate(inmateId)) {
            statusL.setText("Invalid Inmate ID");
            return;
        }


        String reportDetails =
                "===== MEDICAL REPORT =====\n" +
                        "Inmate ID: " + inmateId + "\n\n" +
                        "Visit History:\n- 3 Check-ups recorded\n\n" +
                        "Prescriptions:\n- Painkillers\n- Antibiotics\n\n" +
                        "Health Trend:\n- Stable condition\n" +
                        "No critical issues detected\n";


        Medical_report report = new Medical_report(
                inmateId,
                fromDate,
                toDate,
                reportDetails
        );


        medicalreportList.add(report);


        reportsTA.setText(reportDetails);


        statusL.setText("Medical Report Generated Successfully");


        inmateIDTF.clear();
        startDateDP.setValue(null);
        endDateDP.setValue(null);
    }



    private boolean isValidInmate(String inmateId) {
        return inmateId.startsWith("IN"); // simple rule
    }
}