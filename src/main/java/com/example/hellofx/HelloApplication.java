package com.example.hellofx;

import com.example.hellofx.views.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    private static final String WINDOW_TITLE = "Hello JavaFX";
    private static final int WINDOW_WIDTH = 640;
    private static final int WINDOW_HEIGHT = 480;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Scene mainViewScene = new Scene(new MainView(20));

        primaryStage.setScene(mainViewScene);
        primaryStage.setTitle(WINDOW_TITLE);
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.setHeight(WINDOW_HEIGHT);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}