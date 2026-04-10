package com.oop.sneha.simulatingoperationofaprisonmanagement;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private TextField userIDTF;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private Label userIDL;
    @javafx.fxml.FXML
    private Label passwordL;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void createAccountOAButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginOAButton(ActionEvent actionEvent) {

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


        String  id, password ;
        boolean flag = true ;

        Alert errotalert = new Alert(Alert.AlertType.ERROR);

        id = userIDTF.getText();
        password = passwordPF.getText() ;

        if (id.isBlank()){
            flag = false ;
            errotalert.setTitle("User ID Error");
            errotalert.setContentText("User ID cannot be blank");
            errotalert.showAndWait() ;
        }

        if (password.isBlank()){
            flag = false ;
            errotalert.setTitle("Password Error");
            errotalert.setContentText("Password cannot be blank");
            errotalert.showAndWait() ;
        }

        if (flag){
            if (id.length() == 7){
                //        login as a medical officer
            } else if (id.length() == 6) {
                //        login as a rehabilitation officer
            } else {
                errotalert.setTitle("USER ID Error");
                errotalert.setContentText("User ID Type Does Not Exist");
                errotalert.showAndWait() ;
            }
        }
    }
}