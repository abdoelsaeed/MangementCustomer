package com.example.customer_mangement_system;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class con {
     ArraycustomerList r2=new ArraycustomerList();

    private  static con INSTANCE;


    private con() {
    }

    public static con getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new con();
        }

        return INSTANCE;
    }

        @FXML
    private Button delete;

    @FXML
    private Button display;

    @FXML
    private Button find;

    @FXML
    private Button insert;

    @FXML
    private TextField num;

    @FXML
    private TextField taccum;

    @FXML
    private TextField tcurrent;

    @FXML
    private TextField three;

    @FXML
    private TextField tid;

    @FXML
    private TextField tname;

    @FXML
    private TextField tnationality;

    @FXML
    private TextField tphone;

    @FXML
    private Text tt;

    @FXML
    private TextField two;
    int current=0;
    @FXML
    void delete(ActionEvent event) {
        Integer b=Integer.parseInt(two.getText());
        int a=r2.findcoustomerby_id(b);
        if(a==-1)
        {
            tt.setText("The item not found");
        }
        else {
            r2.delete(b);
            tt.setText("<<<<<<<<<<<<<<<<<<<<DONE>>>>>>>>>>>>>>>>>>>>");
        }
    }

    @FXML
    void display(ActionEvent event) {
        if(r2.display()==null){
            tt.setText("There are no Customer ");}
        else {
            tt.setText(r2.display());
        }
    }

    @FXML
    void find(ActionEvent event) {
        Integer id=Integer.parseInt(three.getText());
        if(r2.findcoustomerby_id(id)==-1) {

            tt.setText("There is no one with that ID");
            three.setText("");
        }else {
            tt.setText("The index = "+r2.findcoustomerby_id(id)+"               [ Note the index start  { 0 } ] ");
            three.setText("");}
    }

    @FXML
    void insert(ActionEvent event) {



        Customer r1 = new Customer();

        Integer id = Integer.parseInt(tid.getText());
        r1.setContract_ID(id);
        tid.setText("");

        r1.setName(tname.getText());
        tname.setText("");

        r1.setNationality(tnationality.getText());
        tnationality.setText("");

        r1.setPhone(tphone.getText());
        tphone.setText("");

        Double current = Double.parseDouble(tcurrent.getText());
        r1.setCurrent_Bill_Amount(current);
        tcurrent.setText("");

        Double acc = Double.parseDouble(taccum.getText());
        r1.setAccumulated_Bill_Amount(acc);
        taccum.setText("");
        r2.insert(r1);


            tt.setText("<<<<<<<<<<<<<<<<<<<<DONE>>>>>>>>>>>>>>>>>>>>");

    }
}
