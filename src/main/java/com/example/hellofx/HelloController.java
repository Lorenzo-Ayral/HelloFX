package com.example.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public void up(ActionEvent actionEvent) {
        System.out.println("up");
    }
    public void down(ActionEvent actionEvent) {
        System.out.println("down");
    }
    public void right(ActionEvent actionEvent) {
        System.out.println("right");
    }
    public void left(ActionEvent actionEvent) {
        System.out.println("left");
    }
}
