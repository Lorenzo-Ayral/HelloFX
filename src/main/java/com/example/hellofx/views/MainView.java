package com.example.hellofx.views;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class MainView extends VBox {
        public MainView(double spacing) {
            super(spacing);

            ObservableList<Node> components = this.getChildren();

            Label someLabel = new Label("Un champ de texte :");
            TextField someTextField = new TextField();
            PasswordField somePasswordField = new PasswordField();
            Separator separator = new Separator(Orientation.HORIZONTAL);
            
            TextArea someTextArea = new TextArea();
            someTextArea.setWrapText(true);

            components.addAll(someLabel, someTextField, separator, someTextArea, somePasswordField);
        }
}
