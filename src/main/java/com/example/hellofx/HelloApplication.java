package com.example.hellofx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
    StageStyle :
    DECORATED - The Stage will have a border and other decorations typical of a window, depending on the platform.
    UNDECORATED - The Stage will have no decorations.
    TRANSPARENT - The Stage will have no decorations, and the pixels of its window will be fully transparent.
*/

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        primaryStage.initStyle(StageStyle.DECORATED);
//        primaryStage.isFullScreen();
//        primaryStage.isAlwaysOnTop();
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}