module com.example.snakes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakes to javafx.fxml;
    exports com.example.snakes;
}