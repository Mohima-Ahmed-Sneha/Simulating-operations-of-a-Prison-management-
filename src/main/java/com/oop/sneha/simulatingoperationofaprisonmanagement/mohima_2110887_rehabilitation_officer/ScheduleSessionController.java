package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.time.LocalDate;

public class ScheduleSessionController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private ComboBox <String> timeCB;
    @javafx.fxml.FXML
    private Label availabilityL;
    @javafx.fxml.FXML
    private TextField counsellorNameTF;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label confirmL;
    @javafx.fxml.FXML
    private DatePicker dateDP;

    @javafx.fxml.FXML
    public void initialize() {

        timeCB.getItems().addAll(
                "09:00 AM", "10:00 AM", "11:00 AM",
                "02:00 PM", "03:00 PM"
        );

        statusL.setText("");
        confirmL.setText("");
        availabilityL.setText("");

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
    public void sessionOAButton(ActionEvent actionEvent) {

        String inmateID = inmateIDTF.getText();
        LocalDate date = dateDP.getValue();
        String time = timeCB.getValue();
        String counsellor = counsellorNameTF.getText();


        if (inmateID.isEmpty() || date == null || time == null || counsellor.isEmpty()) {
            statusL.setText("Please fill all fields!");
            confirmL.setText("");
            return;
        }


        if (time.equals("10:00 AM")) {
            availabilityL.setText("Counsellor NOT available!");
            confirmL.setText("");
            return;
        } else {
            availabilityL.setText("Counsellor available");
        }


        Session session = new Session(inmateID, date, time, counsellor);


        confirmL.setText("Session Scheduled Successfully!");
        statusL.setText("");

        // (Optional) Print in console
        System.out.println(session.getDetails());
    }
}