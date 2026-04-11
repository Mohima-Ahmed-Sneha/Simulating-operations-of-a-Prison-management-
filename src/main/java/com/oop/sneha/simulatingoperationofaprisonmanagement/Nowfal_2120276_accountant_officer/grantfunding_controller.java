package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class grantfunding_controller
{
    @javafx.fxml.FXML
    private TableColumn<grantfunding,Integer> amountTC;
    @javafx.fxml.FXML
    private TableColumn<grantfunding,String> referenceTC;
    @javafx.fxml.FXML
    private TextField referenceTF;
    @javafx.fxml.FXML
    private TableColumn<grantfunding,String> statusTC;
    @javafx.fxml.FXML
    private TableView<grantfunding> tableView;
    @javafx.fxml.FXML
    private TextField amountTF;
    private ArrayList<grantfunding> DataList;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
        DataList= new ArrayList<>();

        referenceTC.setCellValueFactory(new PropertyValueFactory<grantfunding,String>("refnum"));
        amountTC.setCellValueFactory(new PropertyValueFactory<grantfunding,Integer>("amount"));
        statusTC.setCellValueFactory(new PropertyValueFactory<grantfunding,String>("status"));

        
    }


    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {

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

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {
        if (referenceTF.getText().isEmpty()||
        amountTF.getText().isEmpty()){
            resultLabel.setText("Fill all the field");

        }
        else {
            boolean sameName = false;
            for (grantfunding d : DataList) {
                if (d.getRefnum().equals(referenceTF.getText())) sameName = true;
            }
            if (sameName) {
                grantfunding DataAdd = new grantfunding(
                        referenceTF.getText(),
                        Integer.parseInt(amountTF.getText()),"Active");
                DataList.add(DataAdd);
                tableView.getItems().add(DataAdd);
                resultLabel.setText("same Program found");
            }
            else {
                grantfunding DataAdd = new grantfunding(
                        referenceTF.getText(),
                        Integer.parseInt(amountTF.getText()),"Allocated");

                DataList.add(DataAdd);
                tableView.getItems().add(DataAdd);
                resultLabel.setText("Add done");
            }

        }



    }


}