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
    private static final String C_to_F = "Celcius to Fahrenheit";
    private static final String F_to_C = "Fahrenheit to Celsius";
    private boolean isC_to_F = true;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox.getItems().add(C_to_F);
        choiceBox.getItems().add(F_to_C);
        choiceBox.setValue(C_to_F);
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observableValue, s, t1) -> {
            if(t1.equals(C_to_F)){
                isC_to_F = true;
            }else{
                isC_to_F = false;
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

        float enteredTemperature = Float.parseFloat(input);
        float newTemperature = 0.0f;
        try {
            if (isC_to_F) {
                newTemperature = (enteredTemperature * 9 / 5) + 32;
            } else {
                newTemperature = (enteredTemperature - 32) * 5 / 9;
            }
        }catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        String unit = isC_to_F? "F" : "C";
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Temperature Convertor App");
        alert.setHeaderText(choiceBox.getValue());
        alert.setContentText("The new Temperature is " + newTemperature + unit);
        alert.show();

    }
//    private void display(float newTemperature){
//        String unit = isC_to_F? "F" : "C";
//        String result = "The new Temperature is " + newTemperature + unit ;
//    }
}
