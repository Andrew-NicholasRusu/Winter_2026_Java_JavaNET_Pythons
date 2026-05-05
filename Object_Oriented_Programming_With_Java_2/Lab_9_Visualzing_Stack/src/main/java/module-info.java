module com.lab9.lab9visualzingstack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lab9.lab9visualzingstack to javafx.fxml;
    exports com.lab9.lab9visualzingstack;
}