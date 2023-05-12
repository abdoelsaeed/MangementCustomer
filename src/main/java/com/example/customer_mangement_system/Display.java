package com.example.customer_mangement_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Display {

    @FXML
    private Button display;

    @FXML
    private Label label;

    @FXML
    void display(ActionEvent event) {
if(HelloController.r2==null){
    label.setText("NO DATA ");
}
else {
    label.setText(HelloController.r2.display());
}
    }

}

