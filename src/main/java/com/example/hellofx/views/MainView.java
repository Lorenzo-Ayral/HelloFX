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

            Label someLabel = new Label("Un champ de texte :");
            TextField someTextField = new TextField();
            PasswordField somePasswordField = new PasswordField();
            Separator separator = new Separator(Orientation.HORIZONTAL);
            List<String> fontFamilies = Font.getFamilies();
            if (fontFamilies.contains("Tlwg Mono")) {
                System.out.println("La police 'Tlwg Mono' est disponible.");
            } else {
                System.out.println("La police 'Tlwg Mono' n'est pas disponible.");
            }
            
            TextArea someTextArea = new TextArea();
            someTextArea.setWrapText(true);

//            Font someFont = new Font("Tlwg Mono", 30);
//
//            for(String s : Font.getFontNames())
//                System.out.println(s);


            Text someText = new Text("Un texte\nsur plusieurs\nlignes");
//            Font.font(<family>, <weight>, <posture>, <size>)
            someText.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 30));
            someText.setFill(Color.RED);
            someText.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
            someText.setLineSpacing(10);

            components.addAll(someLabel, someTextField, separator, someTextArea, somePasswordField, someText);
        }
}
