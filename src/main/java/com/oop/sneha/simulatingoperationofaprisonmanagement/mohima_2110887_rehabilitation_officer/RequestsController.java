package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class RequestsController
{
    @javafx.fxml.FXML
    private TableColumn <Requests, String> inmateIDTC;
    @javafx.fxml.FXML
    private TableColumn <Requests, String> statusTC;
    @javafx.fxml.FXML
    private TableView <Requests>requestTV;
    @javafx.fxml.FXML
    private TableColumn <Requests, String> requestIDTC;
    @javafx.fxml.FXML
    private TableColumn <Requests, String> programmeIDTC;

    private ObservableList<Requests> requestList;

    @javafx.fxml.FXML
    public void initialize() {

        requestList = FXCollections.observableArrayList();

        // Link columns to class properties
        requestIDTC.setCellValueFactory(new PropertyValueFactory<>("requestID"));
        inmateIDTC.setCellValueFactory(new PropertyValueFactory<>("inmateID"));
        programmeIDTC.setCellValueFactory(new PropertyValueFactory<>("programmeID"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Sample data (you can remove later)
        requestList.add(new Requests("R101", "2001", "P01", "Pending"));
        requestList.add(new Requests("R102", "2002", "P02", "Pending"));

        requestTV.setItems(requestList);

    }

    @javafx.fxml.FXML
    public void rejectOAButton(ActionEvent actionEvent) {

        Requests selected = requestTV.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Please select a request!");
            return;
        }

        selected.setStatus("Rejected");
        requestTV.refresh();

    }

    @javafx.fxml.FXML
    public void acceptedOAButton(ActionEvent actionEvent) {

        Requests selected = requestTV.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Please select a request!");
            return;
        }

        // Simulated eligibility check
        boolean eligible = true;

        if (!eligible) {
            showAlert("Inmate not eligible!");
            return;
        }

        selected.setStatus("Approved");
        requestTV.refresh();

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
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(message);
        alert.showAndWait();
    }
}