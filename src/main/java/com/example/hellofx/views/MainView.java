package com.example.hellofx.views;

import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.List;

public class MainView extends VBox {
        public MainView(double spacing) {
            super(spacing);

            ObservableList<Node> components = this.getChildren();

            Label someLabel = new Label("Un champ de texte :");
            TextField someTextField = new TextField();
            PasswordField somePasswordField = new PasswordField();
            Separator separator = new Separator(Orientation.HORIZONTAL);
            List<String> fontFamilies = Font.getFamilies();
            if (fontFamilies.contains("AnjaliOldLipi")) {
                System.out.println("La police 'AnjaliOldLipi' est disponible.");
            } else {
                System.out.println("La police 'AnjaliOldLipi' n'est pas disponible.");
            }
            
            TextArea someTextArea = new TextArea();
            someTextArea.setWrapText(true);

            Font someFont = new Font("AnjaliOldLipi", 50);

            for(String s : Font.getFamilies())
                System.out.println(s);

            Text someText = new Text("Un texte\nsur plusieurs\nlignes");
            someText.setFont(someFont);
            someText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
            someText.setLineSpacing(10);

            components.addAll(someLabel, someTextField, separator, someTextArea, somePasswordField, someText);
        }
}
