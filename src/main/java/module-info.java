module com.example.simpledicegamenetwork10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simpledicegamenetwork10 to javafx.fxml;
    exports com.example.simpledicegamenetwork10;
    exports com.example.simpledicegamenetwork10.Controller;
    opens com.example.simpledicegamenetwork10.Controller to javafx.fxml;
}