package com.example.hellofx.views;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.List;

public class MainView extends VBox {
        public MainView(double spacing) {
            super(spacing);
            ObservableList<Node> components = this.getChildren();

            Button someButton = new Button("Click me!");
            someButton.setOnAction(e -> {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("Look, an Information Dialog");
                alert.setContentText("I have a great message for you!");
                alert.showAndWait();
            });

            Button someOtherButton = new Button("Click me!");
            someOtherButton.setDefaultButton(true);


            components.addAll(someButton, someOtherButton);
        }
}
