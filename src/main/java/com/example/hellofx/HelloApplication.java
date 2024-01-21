package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {

    private static final String WINDOW_TITLE = "Hello JavaFX";
    private static final int WINDOW_WIDTH = 640;
    private static final int WINDOW_HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Parent root2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("css-view.fxml")));
//        String css = Objects.requireNonNull(this.getClass().getResource("hello.css")).toExternalForm();
        primaryStage.setTitle(WINDOW_TITLE);
        primaryStage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        Stage secondaryStage = new Stage();
        secondaryStage.setTitle("Secondary Stage");
        secondaryStage.setScene(new Scene(root2, WINDOW_WIDTH, WINDOW_HEIGHT));


        primaryStage.show();
        secondaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}