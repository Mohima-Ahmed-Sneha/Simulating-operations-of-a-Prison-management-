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
import java.util.Objects;

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

        String id = userIDTF.getText();
        String password = passwordPF.getText();

        Alert errorAlert = new Alert(Alert.AlertType.ERROR);

        // ✅ Validation FIRST
        if (id.isBlank()) {
            errorAlert.setContentText("User ID cannot be blank");
            errorAlert.showAndWait();
            return;
        }

        if (password.isBlank()) {
            errorAlert.setContentText("Password cannot be blank");
            errorAlert.showAndWait();
            return;
        }

        Parent root = null;

        try {
            // ✅ THEN decide dashboard
            if (id.length() == 7) {
                // Medical Officer
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                        "/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_medical_officer/medical_officer_dashboard.fxml"
                )));

            } else if (id.length() == 6) {
                // Rehabilitation Officer
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                        "/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_rehabilitation_officer/ro_dashboard.fxml"
                )));

            } else if (id.length() == 5) {
                // Rehabilitation Officer
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                        "/com/oop/sneha/simulatingoperationofaprisonmanagement/Nowfal_2120276_accountant_officer/accountant_officer_view.fxml"
                )));
            } else if (id.length() == 4) {
                // Rehabilitation Officer
                root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(
                        "/com/oop/sneha/simulatingoperationofaprisonmanagement/Nowfal_2120276_legal_authority/legal_authority_view.fxml"
                )));
            } else {errorAlert.setContentText("User ID Type Does Not Exist");
                errorAlert.showAndWait();
                return;
            }

            // ✅ Switch scene
            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


