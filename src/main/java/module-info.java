module com.oop.sneha.simulatingoperationofaprisonmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    requires jdk.httpserver;


    opens com.oop.sneha.simulatingoperationofaprisonmanagement to javafx.fxml;
    opens com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_rehabilitation_officer to javafx.fxml, java.base;
    opens com.oop.sneha.simulatingoperationofaprisonmanagement.mohima_2110887_medical_officer to javafx.fxml, java.base;
    opens com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_accountant_officer to javafx.fxml, javafx.base;
    opens com.oop.sneha.simulatingoperationofaprisonmanagement.Nowfal_2120276_legal_authority to javafx.fxml, javafx.base;


    exports com.oop.sneha.simulatingoperationofaprisonmanagement;
}