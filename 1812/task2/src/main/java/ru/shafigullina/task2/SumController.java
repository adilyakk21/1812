package ru.shafigullina.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField n1TextField;

    @FXML
    private TextField n2TextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int firstNum = Integer.parseInt(n1TextField.getText().toString());
        int secondNum = Integer.parseInt(n2TextField.getText().toString());
        if (firstNum < secondNum){
            resLabel.setText("Наименьшее число под №1");
        }else if (secondNum < firstNum){
            resLabel.setText("Наименьшее число под №2");
        }else{
            resLabel.setText("Оба числа равны");
        }
    }
}