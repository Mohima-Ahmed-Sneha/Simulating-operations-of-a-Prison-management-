package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_legal_authority;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class facilityTransfer_controller
{

    @javafx.fxml.FXML
    private TableView transferTableview;
    @javafx.fxml.FXML
    private TextField reasonText;
    @javafx.fxml.FXML
    private TableColumn prisonaddressTable;
    @javafx.fxml.FXML
    private TableColumn availablebedTable;
    @javafx.fxml.FXML
    private TableColumn trasportteamTable;
    @javafx.fxml.FXML
    private ComboBox<String> facilityCombobox;
    @javafx.fxml.FXML
    private TextField inmateIdText;

    @javafx.fxml.FXML
    public void initialize() {
        facilityCombobox.getItems().addAll("water","hot","cold");

    }

    @javafx.fxml.FXML
    public void trasfersearchButton(ActionEvent actionEvent) {
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