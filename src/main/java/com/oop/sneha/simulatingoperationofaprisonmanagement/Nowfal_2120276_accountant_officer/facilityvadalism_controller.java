package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class facilityvadalism_controller {
    @javafx.fxml.FXML
    private Label displayLabel;
    @javafx.fxml.FXML
    private ComboBox<String> inventoryCombo;
    @javafx.fxml.FXML
    private TextField inmateIdText;
    public int price;

    @javafx.fxml.FXML
    public void initialize() {
        inventoryCombo.getItems().addAll("Bed","Chair","Table");
    }

    @javafx.fxml.FXML
    public void calculatebutton(ActionEvent actionEvent) {
         if (inventoryCombo.getValue().equals("Bed")){
             price = 200;
         } else if (inventoryCombo.getValue().equals("Chair")) {
             price = 300;
         }else if (inventoryCombo.getValue().equals("Table")){
             price = 400;
        }
         int value= (price+(price*10/100));
         int remain= 1000-value;

        displayLabel.setText("Inmate ID : "+inmateIdText.getText()+'\n'+"Replacement Value = "+Integer.toString(value)+'\n'+
                "Inmate new balance = "+Integer.toString(remain));


    }

    @javafx.fxml.FXML
    public void backButtom(ActionEvent actionEvent) {

        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/Nowfal_2120276_accountant_officer/accountant_officer_view.fxml"));
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