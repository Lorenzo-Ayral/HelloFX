package com.example.hellofx.views;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class MainView extends VBox {
        public MainView(double spacing) {
            super(spacing);

            ObservableList<Node> components = this.getChildren();

            Label someLabel = new Label("Un champ de texte :");
            TextField someTextField = new TextField();
            PasswordField somePasswordField = new PasswordField();

            components.addAll(someLabel, someTextField, somePasswordField);
        }
}
