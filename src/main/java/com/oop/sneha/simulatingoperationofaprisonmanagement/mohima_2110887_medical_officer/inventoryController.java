package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class inventoryController
{
    @javafx.fxml.FXML
    private TextField quantityUsedTF;
    @javafx.fxml.FXML
    private Label itemNameL;
    @javafx.fxml.FXML
    private Label inventoryTableL;
    @javafx.fxml.FXML
    private TableColumn <Inventory,Integer>quantityAddedTC;
    @javafx.fxml.FXML
    private TableColumn <Inventory,Integer>quantityUsedTC;
    @javafx.fxml.FXML
    private TextField currentStockTF;
    @javafx.fxml.FXML
    private TableColumn <Inventory,Integer>currentStockTC;
    @javafx.fxml.FXML
    private TextField quantityAddedTF;
    @javafx.fxml.FXML
    private Label quantityUsed;
    @javafx.fxml.FXML
    private TableColumn <Inventory,String>itemNameTC;
    @javafx.fxml.FXML
    private TableView <Inventory> inventoryTV;
    @javafx.fxml.FXML
    private TextField itemNameTF;
    @javafx.fxml.FXML
    private Label statusL;
    @javafx.fxml.FXML
    private Label currentStockL;
    @javafx.fxml.FXML
    private Label quantityAddedL;

    private ArrayList<Inventory> inventoryList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        itemNameTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleStringProperty(data.getValue().getItemName()));

        quantityAddedTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getQtyAdded()));

        quantityUsedTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getQtyUsed()));

        currentStockTC.setCellValueFactory(data ->
                new javafx.beans.property.SimpleObjectProperty<>(data.getValue().getRemaining()));

    }

    @javafx.fxml.FXML
    public void updateOAButoon(ActionEvent actionEvent) {
        String itemName = itemNameTF.getText();



        if (itemName.isEmpty() ||
                quantityAddedTF.getText().isEmpty() ||
                quantityUsedTF.getText().isEmpty()) {

            statusL.setText("Invalid: Fill all fields");
            return;
        }

        try {
            int added = Integer.parseInt(quantityAddedTF.getText());
            int used = Integer.parseInt(quantityUsedTF.getText());

            if (added < 0 || used < 0) {
                statusL.setText("Invalid: Quantity cannot be negative");
                return;
            }


            Inventory item = new Inventory(
                    itemName,
                    added,
                    used
            );



            inventoryList.add(item);
            inventoryTV.getItems().add(item);


            currentStockTF.setText(String.valueOf(item.getRemaining()));


            statusL.setText("Inventory Updated Successfully");



            itemNameTF.clear();
            quantityAddedTF.clear();
            quantityUsedTF.clear();

        } catch (NumberFormatException e) {
            statusL.setText("Invalid: Enter numeric values");
        }
        }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        Parent root = null;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource( "/com/oop/sneha/simulatingoperationofaprisonmanagement/login.fxml"));
            root = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Medical Officer");
        stage.show();

    }
}