module com.oop.sneha.simulatingoperationofaprisonmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.sneha.simulatingoperationofaprisonmanagement to javafx.fxml;
    exports com.oop.sneha.simulatingoperationofaprisonmanagement;
}