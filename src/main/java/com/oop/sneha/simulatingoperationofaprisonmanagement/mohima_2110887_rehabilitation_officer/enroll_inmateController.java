package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class enroll_inmateController
{
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private TableView <Enroll_inmate>enrollmentTV;
    @javafx.fxml.FXML
    private TableColumn <Enroll_inmate, String> programmeTC;
    @javafx.fxml.FXML
    private TableColumn <Enroll_inmate, String> dateTC;
    @javafx.fxml.FXML
    private Label enrolllmentL;
    @javafx.fxml.FXML
    private TableColumn <Enroll_inmate, String> inmateTC;
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private Label dateL;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label programmeIDL;
    @javafx.fxml.FXML
    private TextField programmeTF;
    @javafx.fxml.FXML
    private DatePicker dateDP;

    private ObservableList<Enroll_inmate> enrollmentList;

    @javafx.fxml.FXML
    public void initialize() {

        enrollmentList = FXCollections.observableArrayList();

        // Link table columns with model class
        inmateTC.setCellValueFactory(new PropertyValueFactory<>("inmateId"));
        programmeTC.setCellValueFactory(new PropertyValueFactory<>("programmeId"));
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));

        enrollmentTV.setItems(enrollmentList);


    }



    @javafx.fxml.FXML
    public void enrollButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        String programmeId = programmeTF.getText();

        if (inmateId.isBlank() || programmeId.isBlank() || dateDP.getValue() == null) {
            statusL.setText("Please fill all fields!");
            return;
        }


        String date = dateDP.getValue().toString();


        Enroll_inmate enroll = new Enroll_inmate(inmateId, programmeId, date);


        enrollmentList.add(enroll);


        statusL.setText("Enrollment Successful!");


        inmateIDTF.clear();
        programmeTF.clear();
        dateDP.setValue(null);

    }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        try {
            javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(
                    getClass().getResource("/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_rehabilitation_officer/ro_dashboard.fxml")
            );

            javafx.scene.Parent root = loader.load();

            javafx.stage.Stage stage = (javafx.stage.Stage)((javafx.scene.Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new javafx.scene.Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}