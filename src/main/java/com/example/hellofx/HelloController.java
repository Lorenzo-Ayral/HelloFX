package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle circle;
    private double x;
    private double y;


    public void up(ActionEvent actionEvent) {
        circle.setCenterY(y-=1);
    }
    public void down(ActionEvent actionEvent) {
        circle.setCenterY(y+=1);
    }
    public void right(ActionEvent actionEvent) {
        circle.setCenterX(x+=1);
    }
    public void left(ActionEvent actionEvent) {
        circle.setCenterX(x -= 1);
    }
}
