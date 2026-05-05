module com.lab9.lab9simulatequeue {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lab9.lab9simulatequeue to javafx.fxml;
    exports com.lab9.lab9simulatequeue;
}