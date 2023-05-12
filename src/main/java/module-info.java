module com.example.customer_mangement_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.customer_mangement_system to javafx.fxml;
    exports com.example.customer_mangement_system;
}