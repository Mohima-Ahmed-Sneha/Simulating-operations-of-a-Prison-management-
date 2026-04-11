package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_legal_authority;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class parole_controller
{
    @javafx.fxml.FXML
    private TextField infractionText;
    @javafx.fxml.FXML
    private TextField educationhourText;
    @javafx.fxml.FXML
    private Label paroleLabel;
    @javafx.fxml.FXML
    private TextField workhourText;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void paroleButton(ActionEvent actionEvent) {

        Float work= Float.parseFloat(workhourText.getText());
        Float edu = Float.parseFloat(educationhourText.getText());
        Float inf = Float.parseFloat(infractionText.getText());

        float score = (work+edu)/inf;
        if (score >= 20){
            paroleLabel.setText("Eligible for parole");
        }
        else {
            paroleLabel.setText("Deined");
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