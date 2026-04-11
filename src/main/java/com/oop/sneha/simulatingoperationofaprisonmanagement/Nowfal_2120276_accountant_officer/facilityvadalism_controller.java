package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class facilityvadalism_controller
{
    @javafx.fxml.FXML
    private Label displayLabel;
    @javafx.fxml.FXML
    private ComboBox<String> inventoryCombo;
    @javafx.fxml.FXML
    private TextField inmateIdText;

    @javafx.fxml.FXML
    public void initialize() {
        inventoryCombo.getItems().addAll("Bed","chair","table");
    }

    @javafx.fxml.FXML
    public void calculatebutton(ActionEvent actionEvent) {


    }
}