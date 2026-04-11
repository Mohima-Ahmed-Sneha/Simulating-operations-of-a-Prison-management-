package com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer;

import com.oop.sneha.simulatingoperationofaprisonmanagement.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class payroll_controller
{
    @javafx.fxml.FXML
    private TableColumn<payroll,Float> overtimerateTC;
    @javafx.fxml.FXML
    private TableView<payroll> payrollTableView;
    @javafx.fxml.FXML
    private TableColumn<payroll,Integer> basehourTC;
    @javafx.fxml.FXML
    private TableColumn<payroll,Float> annualbudgercapTC;
    @javafx.fxml.FXML
    private TextField workhourText;
    @javafx.fxml.FXML
    private TableColumn<payroll,Float> baserateTC;
    @javafx.fxml.FXML
    private TableColumn<payroll,Float> overtimeTC;
    @javafx.fxml.FXML
    private TableColumn<payroll,Float> totalTC;
    @javafx.fxml.FXML
    private TextField inmateIdText;
    private ArrayList<payroll> DataList;

    @javafx.fxml.FXML
    public void initialize() {
        DataList= new ArrayList<>();

        basehourTC.setCellValueFactory(new PropertyValueFactory<payroll,Integer>("baseHour"));
        baserateTC.setCellValueFactory(new PropertyValueFactory<payroll,Float>("baseRate"));
        overtimeTC.setCellValueFactory(new PropertyValueFactory<payroll,Float>("overTime"));
        overtimerateTC.setCellValueFactory(new PropertyValueFactory<payroll,Float>("overTimeRate"));
        totalTC.setCellValueFactory(new PropertyValueFactory<payroll,Float>("Total"));
        annualbudgercapTC.setCellValueFactory(new PropertyValueFactory<payroll,Float>("annualBudgetCap"));

    }

    @javafx.fxml.FXML
    public void payrollsubmitButton(ActionEvent actionEvent) {

        Float work= Float.parseFloat(workhourText.getText());
        int baseHour=8;
        Float baseRate=15f;
        Float overTime = work-baseHour;
        Float overTimeRate= 22.5f;
        Float total = (baseHour*baseRate)+(overTime*overTimeRate);
        Float annualBudgetCap= 1000f;

        payroll dataAdd = new payroll(baseHour,baseRate,overTime,overTimeRate,total,annualBudgetCap);
        DataList.add(dataAdd);
        payrollTableView.getItems().add(dataAdd);




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
}