module com.example.scenestageswitcher {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenestageswitcher to javafx.fxml;
    exports com.example.scenestageswitcher;
}