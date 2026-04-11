package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class view_historyController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TableColumn <View_history, String> attendanceTC;
    @javafx.fxml.FXML
    private TableColumn <View_history, String> inmateIDTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private TableColumn <View_history, String> gradeTC;
    @javafx.fxml.FXML
    private Label historyTableL;
    @javafx.fxml.FXML
    private TableColumn <View_history, Double> scoreTC;
    @javafx.fxml.FXML
    private TableColumn <View_history, String> programmeIDTC;
    @javafx.fxml.FXML
    private TableView <View_history> historyTV;

    private final ObservableList<View_history> historyList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        inmateIDTC.setCellValueFactory(cellData -> cellData.getValue().inmateIDProperty());
        programmeIDTC.setCellValueFactory(cellData -> cellData.getValue().programmeIDProperty());
        attendanceTC.setCellValueFactory(cellData -> cellData.getValue().attendanceProperty());
        scoreTC.setCellValueFactory(cellData -> cellData.getValue().scoreProperty().asObject());
        gradeTC.setCellValueFactory(cellData -> cellData.getValue().gradeProperty());

        historyTV.setItems(historyList);

    }

    @javafx.fxml.FXML
    public void viewHistoryOAButton(ActionEvent actionEvent) {

        String inmateID = inmateIDTF.getText();

        if (inmateID.isEmpty()) {
            statusL.setText("Please enter inmate ID");
            return;
        }


        historyList.clear();

        historyList.add(new View_history(inmateID, "P101", "80%", 75.5, "B"));
        historyList.add(new View_history(inmateID, "P102", "90%", 88.0, "A"));
        historyList.add(new View_history(inmateID, "P103", "70%", 65.0, "C"));

        statusL.setText("History loaded successfully");

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
}