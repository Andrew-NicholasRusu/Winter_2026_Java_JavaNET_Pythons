module com.rocoomusic.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rocoomusic.demo to javafx.fxml;
    exports com.rocoomusic.demo;
}