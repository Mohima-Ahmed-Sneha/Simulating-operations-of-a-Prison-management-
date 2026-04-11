package com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class update_progressController
{
    @javafx.fxml.FXML
    private TextField programmeIDTF;
    @javafx.fxml.FXML
    private Label gradeL;
    @javafx.fxml.FXML
    private TableView <Update_progress> progressTV;
    @javafx.fxml.FXML
    private Label attendanceL;
    @javafx.fxml.FXML
    private TextField scoreTF;
    @javafx.fxml.FXML
    private TableColumn <Update_progress, String> scoreTC;
    @javafx.fxml.FXML
    private TableColumn <Update_progress, String> programmeIDTC;
    @javafx.fxml.FXML
    private TextField inmateIDTF;
    @javafx.fxml.FXML
    private TextField attendanceTF;
    @javafx.fxml.FXML
    private TableColumn <Update_progress, String>attendanceTC;
    @javafx.fxml.FXML
    private TableColumn <Update_progress, String> inmateIDTC;
    @javafx.fxml.FXML
    private Label inmateIDL;
    @javafx.fxml.FXML
    private TableColumn <Update_progress, String> gradeTC;
    @javafx.fxml.FXML
    private Label programmeIDL;
    @javafx.fxml.FXML
    private TextField gradeTF;
    @javafx.fxml.FXML
    private Label scoreL;

    private ObservableList<Update_progress> progressList;

    @javafx.fxml.FXML
    public void initialize() {

        progressList = FXCollections.observableArrayList();

        // Bind columns
        inmateIDTC.setCellValueFactory(new PropertyValueFactory<>("inmateID"));
        programmeIDTC.setCellValueFactory(new PropertyValueFactory<>("programmeID"));
        attendanceTC.setCellValueFactory(new PropertyValueFactory<>("attendance"));
        scoreTC.setCellValueFactory(new PropertyValueFactory<>("score"));
        gradeTC.setCellValueFactory(new PropertyValueFactory<>("grade"));

        progressTV.setItems(progressList);

    }

    @javafx.fxml.FXML
    public void updateProgressOAButton(ActionEvent actionEvent) {

        String inmateID = inmateIDTF.getText();
        String programmeID = programmeIDTF.getText();
        String attendance = attendanceTF.getText();
        String score = scoreTF.getText();
        String grade = gradeTF.getText();


        if (inmateID.isEmpty() || programmeID.isEmpty() ||
                attendance.isEmpty() || score.isEmpty() || grade.isEmpty()) {

            attendanceL.setText("Fill all fields!");
            return;
        }


        Update_progress progress = new Update_progress(inmateID, programmeID, attendance, score, grade);


        progressList.add(progress);


        attendanceL.setText("Progress updated successfully!");


        inmateIDTF.clear();
        programmeIDTF.clear();
        attendanceTF.clear();
        scoreTF.clear();
        gradeTF.clear();

    }

    @javafx.fxml.FXML
    public void backOAButton(ActionEvent actionEvent) {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/oop/sneha/simulatingoperationofaprisonmanagement/mohima_2110887_rehabilitation_officer/ro_dashboard.fxml")
            );

            Parent root = loader.load();

            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}