module com.oop.sneha.simulatingoperationofaprisonmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.sneha.simulatingoperationofaprisonmanagement to javafx.fxml;
    opens com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer to javafx.fxml, java.base;
    opens com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer to javafx.fxml, java.base;

    exports com.oop.sneha.simulatingoperationofaprisonmanagement;
}