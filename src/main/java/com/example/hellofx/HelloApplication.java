package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.InputStream;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.AQUAMARINE);

        InputStream is = getClass().getResourceAsStream("/logo.png");
        if (is == null) {
            throw new RuntimeException("Cannot load image: /logo.png");
        }

        Image icon = new Image(is);
        ImageView imageView = new ImageView(icon);
        imageView.setFitHeight(32); // set the height to 32
        imageView.setFitWidth(32); // set the width to 32
        SnapshotParameters parameters = new SnapshotParameters();
        parameters.setFill(Color.TRANSPARENT);
        icon = imageView.snapshot(parameters, null);

        stage.getIcons().add(icon);
        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }
}