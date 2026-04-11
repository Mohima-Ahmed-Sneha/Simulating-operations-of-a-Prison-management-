package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_legal_authority;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class audit_controller
{
    @javafx.fxml.FXML
    private Label temperatureLabel;
    @javafx.fxml.FXML
    private TextField temperaturesText;
    @javafx.fxml.FXML
    private TextField spaceText;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void tempcalculateButton(ActionEvent actionEvent) {
        if (Integer.parseInt(temperaturesText.getText())>18 && Integer.parseInt(spaceText.getText())>50){
            temperatureLabel.setText("Pass");
        }
        else {
            temperatureLabel.setText("fail");
        }
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/Nowfal_2120276_legal_authority/legal_authority_view.fxml"));
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