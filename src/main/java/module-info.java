module com.example.schermatalogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schermatalogin to javafx.fxml;
    exports com.example.schermatalogin;
}