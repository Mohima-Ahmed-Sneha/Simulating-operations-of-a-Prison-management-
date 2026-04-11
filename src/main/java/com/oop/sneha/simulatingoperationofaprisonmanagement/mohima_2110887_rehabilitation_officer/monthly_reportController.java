package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class monthly_reportController
{
    @javafx.fxml.FXML
    private Label status1L;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label yearL;
    @javafx.fxml.FXML
    private ComboBox <String> monthCB;
    @javafx.fxml.FXML
    private TextArea reportTA;
    @javafx.fxml.FXML
    private ComboBox <Integer> yearCB;
    @javafx.fxml.FXML
    private Label monthL;

    @javafx.fxml.FXML
    public void initialize() {

        monthCB.getItems().addAll(
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        );

        yearCB.getItems().addAll(2023, 2024, 2025, 2026);

        statusL.setText("");
        status1L.setText("");

    }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_rehabilitation_officer/ro_dashboard.fxml")
            );

            Parent root = loader.load();

            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("RO Dashboard");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @javafx.fxml.FXML
    public void generateReportOAButton(ActionEvent actionEvent) {

        String month = monthCB.getValue();
        Integer year = yearCB.getValue();


        if (month == null || year == null) {
            status1L.setText("Please select month and year!");
            return;
        }


        Monthly_report report = new Monthly_report(month, year);


        reportTA.setText(report.getReportContent());

        status1L.setText("Report generated successfully!");
    }
}