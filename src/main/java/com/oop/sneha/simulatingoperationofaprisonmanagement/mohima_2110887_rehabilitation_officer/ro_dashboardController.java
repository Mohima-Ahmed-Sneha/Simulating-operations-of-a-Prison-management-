package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ro_dashboardController
{
    @javafx.fxml.FXML
    private BorderPane rdDashboardBP;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void scheduleOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void requestsOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateProgOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trainingOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void enrollOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void historyOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void monthlyRepOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signoutOAButton(ActionEvent actionEvent) {

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
    public void behaviourOAButton(ActionEvent actionEvent) {

        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_rehabilitation_officer/behaviour.fxml"));
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Rehabilitation Officer");
        stage.show();

    }
}