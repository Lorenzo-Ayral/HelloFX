package com.example.hellofx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Objects;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 900, 900, Color.AQUAMARINE);

//        InputStream is = getClass().getResourceAsStream("/logo.png");
//        if (is == null) {
//            throw new RuntimeException("Cannot load image: /logo.png");
//        }
//
//        Image icon = new Image(is);
//        ImageView imageView = new ImageView(icon);
//        imageView.setFitHeight(32); // set the height to 32
//        imageView.setFitWidth(32); // set the width to 32
//        SnapshotParameters parameters = new SnapshotParameters();
//        parameters.setFill(Color.TRANSPARENT);
//        icon = imageView.snapshot(parameters, null);

//        stage.getIcons().add(icon);
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

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(new Double[]{
                200.0, 200.0,
                300.0, 200.0,
                250.0, 300.0
        });
        triangle.setFill(Color.GREEN);

        Circle circle = new Circle();
        circle.setCenterX(300);
        circle.setCenterY(300);
        circle.setRadius(50);
        circle.setFill(Color.YELLOW);

        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/logo.png")));
        ImageView imageView = new ImageView(image);
        imageView.setX(400);
        imageView.setY(400);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);


        stage.setScene(scene);
        stage.show();
    }
}