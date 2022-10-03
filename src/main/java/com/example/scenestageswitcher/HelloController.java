package com.example.scenestageswitcher;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    public Label lbl1;
    public Button btn1;


    public void loadScene2() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Stage stage = (Stage) lbl1.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void loadScene1(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) lbl1.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}