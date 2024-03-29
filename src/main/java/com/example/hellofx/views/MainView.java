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

            CheckBox checkBox = new CheckBox("Check me!");

            CheckBox checkBox2 = new CheckBox("Check me!");
            checkBox2.setAllowIndeterminate(true);

            ProgressBar progressBar = new ProgressBar(0.5);

            // allowIndeterminateProperty()
            // isInderterminate(), isSelected(), isAllowIndeterminate()
            // setAllowIndeterminate(), setIndeterminate(), setSelected()


            components.addAll(someButton, someOtherButton, checkBox, checkBox2, progressBar);
        }
}
