package com.example.customer_mangement_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
   public static ArraycustomerList r2 = new ArraycustomerList();

    @FXML
    private Button delete;

    @FXML
    private Button display;

    @FXML
    private Button find;

    @FXML
    private Button insert;

    @FXML
    private Label result;

    @FXML
    private TextField textdelete;

    @FXML
    private TextField textfind;

    @FXML
    void delete(ActionEvent event) {
        Integer b = Integer.parseInt(textdelete.getText());
        int a = r2.findcoustomerby_id(b);
        if (a == -1) {
            result.setText("The Item Not Found");
        } else {
            r2.delete(b);
            result.setText("DONE");

        }
        textdelete.setText(null);
    }

    @FXML
    void display(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("display.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Sign up");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex){

        }
    }

    @FXML
    void find(ActionEvent event) {
        Integer id = Integer.parseInt(textfind.getText());
        if (r2.findcoustomerby_id(id) == -1) {
            result.setText("There is no one with that ID");
            textfind.setText(null);
        }else{
            result.setText("The index = "+r2.findcoustomerby_id(id)+"     [ Note the index start  { 0 } ] ");
            textfind.setText(null);
        }
    }

    @FXML
    void insert(ActionEvent event) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("insert.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Employee Interface");
            stage.setScene(scene);
            stage.show();
        }
        catch (Exception ex){

        }
    }
}




