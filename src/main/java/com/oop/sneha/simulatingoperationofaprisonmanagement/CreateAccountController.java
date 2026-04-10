package com.oop.sneha.simulatingoperationofaprisonmanagement;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class CreateAccountController
{
    @javafx.fxml.FXML
    private TextArea outputTA;
    @javafx.fxml.FXML
    private RadioButton othersRB;
    @javafx.fxml.FXML
    private TextArea addressTA;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private Label addressL;
    @javafx.fxml.FXML
    private RadioButton femaleRB;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private Label dateL;
    @javafx.fxml.FXML
    private Label genderL;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField phoneNumTF;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private Label emailL;
    @javafx.fxml.FXML
    private Label nameL;
    @javafx.fxml.FXML
    private Label phoneNumL;
    @javafx.fxml.FXML
    private Label passwordL;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createAccountOAButton(ActionEvent actionEvent) {
        String name , email, phoneNum, password, gender="", address;
        LocalDate dob;

        name = nameTF.getText();
        email = emailTF.getText();
        phoneNum = phoneNumTF.getText();
        address = addressTA.getText();
        password = passwordPF.getText();

        if (maleRB.isSelected()){
            gender = "Male";
        } else if (femaleRB.isSelected()) {
            gender = "Female";
        } else if (othersRB.isSelected()){
            gender = "others";
        }



    }
}