package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_legal_authority;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class release_controller
{
    @javafx.fxml.FXML
    private Label certificateLabel;
    @javafx.fxml.FXML
    private DatePicker releaseDate;
    @javafx.fxml.FXML
    private TextField addressText;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField inmateIdText;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void finalizeButton(ActionEvent actionEvent) {
        if (addressText.getText().equals("clear")||addressText.getText().equals("CLEAR")){
            certificateLabel.setText(inmateIdText.getText()+" is clear for Release on "+releaseDate.getValue());
            statusLabel.setText("Released");
        }
        else {
            certificateLabel.setText(inmateIdText.getText()+" is not clear for Release");
            statusLabel.setText("Not Released");
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