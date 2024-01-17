package com.example.hellofx.views;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

public class MainView extends VBox {
        public MainView(double spacing) {
            super(spacing);

            ObservableList<Node> components = this.getChildren();
            
            components.addAll();
        }
}
