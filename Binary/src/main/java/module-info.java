module com.example.binary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.binary to javafx.fxml;
    exports com.example.binary;
}