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

public class warrant_controller
{
    @javafx.fxml.FXML
    private Label signedwarrantLabel;
    @javafx.fxml.FXML
    private TextField probableCauseText;
    @javafx.fxml.FXML
    private TextField inmateIdText;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchwarrantButton(ActionEvent actionEvent) {

        signedwarrantLabel.setText(inmateIdText.getText()+" is charged for "+probableCauseText.getText());
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