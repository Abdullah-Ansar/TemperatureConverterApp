package com.example.selfjavafxapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.WeakHashMap;

public class Controller implements Initializable {

    @FXML
    public Label label;
    @FXML
    public Button btn0;
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;
    @FXML
    public Button btneq;
    @FXML
    public Button btnm;
    @FXML
    public Button btnmin;
    @FXML
    public Button btndel;
    @FXML
    public Button btnsqr;
    @FXML
    public Button btnsqrt;
    @FXML
    public Button btndot;
    @FXML
    public Button btninv;
    @FXML
    public Button btnd;
    @FXML
    public Button btnp;
    @FXML
    public TextField textfield;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btn1.setOnAction(actionEvent -> {
            textfield.setText(btn1.getText());
        });
        btn2.setOnAction(actionEvent -> {
            textfield.setText(btn2.getText() );
        });
        btn3.setOnAction(actionEvent -> {
            textfield.setText(btn3.getText() );
        });
        btn4.setOnAction(actionEvent -> {
            textfield.setText(btn4.getText() );
        });
        btn5.setOnAction(actionEvent -> {
            textfield.setText(btn5.getText() );
        });
        btn6.setOnAction(actionEvent -> {
            textfield.setText(btn6.getText() );
        });
        btn7.setOnAction(actionEvent -> {
            textfield.setText(btn7.getText() );
        });
        btn8.setOnAction(actionEvent -> {
            textfield.setText(btn8.getText() );
        });
        btn9.setOnAction(actionEvent -> {
            textfield.setText(btn9.getText() );
        });
        btn0.setOnAction(actionEvent -> {
            textfield.setText(btn0.getText() );
        });
        btneq.setOnAction(actionEvent -> {
            textfield.setText(btneq.getText() );
        });
        btndot.setOnAction(actionEvent -> {
            textfield.setText(btndot.getText() );
        });
        btnd.setOnAction(actionEvent -> {
            textfield.setText(btnd.getText() );
        });
        btndel.setOnAction(actionEvent -> {
//            textfield.setText(btndel.getText() );
        });
        btnm.setOnAction(actionEvent -> {
            textfield.setText(btnm.getText() );
        });
        btnsqr.setOnAction(actionEvent -> {
            textfield.setText(btnsqr.getText() );
        });
        btnmin.setOnAction(actionEvent -> {
            textfield.setText(btnmin.getText() );
        });
        btnp.setOnAction(actionEvent -> {
            textfield.setText(btnp.getText() );
        });
        btnsqrt.setOnAction(actionEvent -> {
            textfield.setText(btnsqrt.getText() );

        });
        btninv.setOnAction(actionEvent -> {
            textfield.setText(btninv.getText());
        });












        



    }

    public float sum(float sum){
        return sum;

    }
}
