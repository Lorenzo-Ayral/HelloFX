package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

//        Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.AQUAMARINE);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}