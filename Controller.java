package com.example.javafxapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {
    @FXML
    public Label welcomeLabel;
    @FXML
    public ChoiceBox<String> choiceBox;
    @FXML
    public Button convBtn;
    @FXML
    public TextField textField;
    private static final String C_to_F1 = "Celcius to Fahrenheit";
    private static final String F_to_C2 = "Fahrenheit to Celsius";
    private static final String C_to_K3 = "Celcius to Kelvin";
    private static final String K_to_C4 = "Kelvin to Celcius";
    private static final String F_to_K5 = "Fahrenheit to Kelvin";
    private static final String K_to_F6 = "Kelvin to Fahrenheit";

    private int isC_to_F = 1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().add(C_to_F1);
        choiceBox.getItems().add(F_to_C2);
        choiceBox.getItems().add(C_to_K3);
        choiceBox.getItems().add(K_to_C4);
        choiceBox.getItems().add(F_to_K5);
        choiceBox.getItems().add(K_to_F6);
        choiceBox.setValue(C_to_F1);
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> {
            if(t1.equals(C_to_F1)){
                isC_to_F = 1;
            }else if(t1.equals(F_to_C2)){
                isC_to_F = 2;
            }else if(t1.equals(C_to_K3)){
                isC_to_F = 3;
            }else if(t1.equals(K_to_C4)){
                isC_to_F = 4;
            }else if(t1.equals(F_to_K5)){
                isC_to_F = 5;
            }else if(t1.equals(K_to_F6)){
                isC_to_F = 6;
            }
            System.out.println(isC_to_F);
        });
        textField.setOnAction(actionEvent -> {
            convert();
        });

        convBtn.setOnAction(actionEvent -> {

            convert();

    });
    }

    private void convert() {

        String input = textField.getText();
        float enteredTemperature = 0.0f;
        try {
            enteredTemperature = Float.parseFloat(input);
        }catch (Exception exception) {
            warnUser();
            return;
        }

        float newTemperature = 0.0f;
        try {
            if (isC_to_F == 1) {
                newTemperature = (enteredTemperature * 9 / 5) + 32;
            } else if(isC_to_F == 2){
                newTemperature = (enteredTemperature - 32) * 5 / 9;
            }else if(isC_to_F == 3){
                newTemperature = (float) enteredTemperature + 273.15f;
            }else if(isC_to_F == 4){
                newTemperature = enteredTemperature-273.15f;
            }else if(isC_to_F == 5){
                newTemperature = (5.0f/9*(enteredTemperature+459.67f));
            }else if(isC_to_F == 6){
                newTemperature = 9.0f/5*(enteredTemperature - 273.15f) + 32 ;
            }
        }catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        String unit = "F";
        if(isC_to_F == 1 || isC_to_F == 6){
            unit = "F";
        } else if (isC_to_F == 2 || isC_to_F == 4) {
            unit = "C";

        }else{
            unit = "K";
        };
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Temperature Convertor App");
        alert.setHeaderText(choiceBox.getValue());
        alert.setContentText("The new Temperature is " + newTemperature + unit);
        alert.show();

    }

    private void warnUser() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Occured");
        alert.setHeaderText("Invalid Temperature Entered");
        alert.setContentText("Please enter a valid Temperature.");
        alert.show();
    }
//    private void display(float newTemperature){
//        String unit = isC_to_F? "F" : "C";
//        String result = "The new Temperature is " + newTemperature + unit ;
//    }
}
