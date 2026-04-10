package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class checkupController
{
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TableView checkUpRecTV;
    @javafx.fxml.FXML
    private TableColumn inmateIDTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label symptomsL;
    @javafx.fxml.FXML
    private TextField symptomsTF;
    @javafx.fxml.FXML
    private TextField statusTF;
    @javafx.fxml.FXML
    private TableColumn symptomsTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveRecOAButton(ActionEvent actionEvent) {
    }
}