package com.example.calculation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    private Text savedNumbers;

    private String Num1 = "";

    private String Num2 = "";

    private String calculationT;

    @FXML
    void addAction(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML
    void minusAction(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void divideAction(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML
    void multiplicationAction(ActionEvent event) {
        calculationSetup("*");
    }

    public void calculationSetup(String calculationT){
        this.calculationT = calculationT;
        Num1 = Num2;
        Num2 = "";
        savedNumbers.setText(Num1 + " " + calculationT);
    }

    @FXML
    void calculate(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(Num1);
        int secondNumberInt = Integer.parseInt(Num2);

        switch (calculationT) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                savedNumbers.setText(Num1 + " + " + Num2 + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(Num1 + " - " + Num2 + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double)secondNumberInt;
                savedNumbers.setText(Num1 + " / " + Num2 + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(Num1 + " * " + Num2 + " = " + calculatedNumber);
                textField.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void clearTextField(ActionEvent event) {
        Num2 = "";
        textField.setText("");
        savedNumbers.setText("");
    }

    @FXML
    void button0Clicked(ActionEvent event) {
        if(!Num2.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    public void updateTextField(){
        textField.setText(Num2);
    }

    public void addNumber(String number){
        Num2 += number;
        updateTextField();
    }
}
