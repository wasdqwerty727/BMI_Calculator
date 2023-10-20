package com.example.oop_bmi_calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {
    DecimalFormat df = new DecimalFormat("###.##");

    BMI_Calculator bmi = new BMI_Calculator();

    @FXML
    private TextField weightField;
    @FXML
    private TextField heightField;
    @FXML
    private Label resultField;

    @FXML
    private void onButtonClicked(){
        Double weightValue = Double.parseDouble(weightField.getText());
        Double heightValue = Double.parseDouble(heightField.getText());
        Double resultValue = bmi.bmiCalculator( weightValue, heightValue );

        resultField.setText( "Hello" );
        if (resultValue < 18.5){
            resultField.setText("Underweight: " + "\n" + df.format(resultValue));
        } else if (resultValue > 18.5 && resultValue < 24.9) {
            resultField.setText("Normal: " + "\n" + df.format(resultValue));
        } else if (resultValue > 25 && resultValue < 29.9){
            resultField.setText("Overweight: " + "\n" + df.format(resultValue));
        } else if (resultValue > 30) {
            resultField.setText("Obese: " + "\n" + df.format(resultValue));
        }
        weightField.setText("");
        heightField.setText("");
    }
}