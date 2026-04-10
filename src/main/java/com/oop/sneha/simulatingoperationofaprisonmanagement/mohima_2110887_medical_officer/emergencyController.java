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
import java.util.ArrayList;

public class emergencyController
{
    @javafx.fxml.FXML
    private Label emergencyTypeL;
    @javafx.fxml.FXML
    private Label actionsTakenL;
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TableColumn <Emergency, String>inmateIDTC;
    @javafx.fxml.FXML
    private TableColumn <Emergency, String>actionsTakenTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label emergencyTableL;
    @javafx.fxml.FXML
    private TextArea actionsTakenTA;
    @javafx.fxml.FXML
    private TableColumn <Emergency, String>emergencyTC;
    @javafx.fxml.FXML
    private ComboBox <String>emergencyCB;
    @javafx.fxml.FXML
    private TableView  <Emergency>emergencyTV;

    private ArrayList<Emergency> emergencyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        inmateIDTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getInmateID()));

        emergencyTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getType()));

        actionsTakenTC.setCellValueFactory(data ->
                new SimpleStringProperty(data.getValue().getAction()));

        emergencyCB.getItems().addAll("Cardiac","Mental","Physical","Respiratory");
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

    @javafx.fxml.FXML
    public void emergencyOAButton(ActionEvent actionEvent) {

        String inmateId = inmateIDTF.getText();
        String type = emergencyCB.getValue();
        String action = actionsTakenTA.getText();

        // ❌ Validation
        if (inmateId.isEmpty() || type == null || action.isEmpty()) {
            statusL.setText("Invalid: Fill all fields");
            return;
        }


        // ✅ Priority always HIGH for emergency
        String priority = "HIGH";

        // ✅ Create Emergency object
        Emergency emergency = new Emergency(
                inmateId,
                type,
                action
        );

        // ✅ Add to TableView
        emergencyTV.getItems().add(emergency);

        // ✅ Confirmation message
        statusL.setText("Emergency Intervention Logged");

        // 🧼 Clear fields
        inmateIDTF.clear();
        emergencyCB.setValue(null);
        actionsTakenTA.clear();
    }

    private boolean isValidInmate(String inmateId) {
        return true;
    }


}