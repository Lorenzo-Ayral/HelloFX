package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.InputStream;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 900, 900, Color.AQUAMARINE);

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
        stage.setWidth(640);
        stage.setHeight(480);
//        stage.setX(100);
//        stage.setY(200);
//        stage.setFullScreen(true);
//        stage.setFullScreenExitHint("Press q to exit full screen");
//        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));

        Text text = new Text();
        text.setText("Hello, JavaFX!");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 29));

        Line line = new Line();
        line.setStartX(50);
        line.setStartY(50);
        line.setEndX(100);
        line.setEndY(100);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.MAGENTA);
        rectangle.setStrokeWidth(5);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);

        stage.setScene(scene);
        stage.show();
    }
}