package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class accountant_officer_controller
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void vandalismButton(ActionEvent actionEvent) {

        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/Nowfal_2120276_accountant_officer/facilityvandalism-view.fxml"));
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("login");
        stage.show();

    }

    @javafx.fxml.FXML
    public void utilityButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void procurementButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void taxcomlianceButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void payrollButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void profitmarginButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trustaccountButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void grantfundingButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signoutButton(ActionEvent actionEvent) {

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
        stage.setTitle("login");
        stage.show();
    }
}