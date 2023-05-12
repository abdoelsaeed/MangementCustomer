package com.example.customer_mangement_system;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Insert {



    @FXML
    private TextField Accumulated;

    @FXML
    private TextField Current;

    @FXML
    private TextField ID;

    @FXML
    private ImageView image;

    @FXML
    private Button insert;

    @FXML
    private TextField name;

    @FXML
    private TextField nationality;

    @FXML
    private PasswordField phine;

    @FXML
    private Label label;
    @FXML
   void insert(ActionEvent event) {
        Customer r1 = new Customer();

        Integer id = Integer.parseInt(ID.getText());
        r1.setContract_ID(id);
        ID.setText("");

        r1.setName(name.getText());
        name.setText("");

        r1.setNationality(nationality.getText());
        nationality.setText("");

        r1.setPhone(phine.getText());
        phine.setText("");

        Double current = Double.parseDouble(Current.getText());
        r1.setCurrent_Bill_Amount(current);
        Current.setText("");

        Double acc = Double.parseDouble(Accumulated.getText());
        r1.setAccumulated_Bill_Amount(acc);
        Accumulated.setText("");
        HelloController.r2.insert(r1);
        label.setText("DONE");


    }

}
