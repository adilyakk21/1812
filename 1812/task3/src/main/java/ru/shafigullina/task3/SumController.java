package ru.shafigullina.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SumController {

    @FXML
    private TextField n1TextField;

    @FXML
    private TextField n2TextField;

    @FXML
    private TextField n3TextField;

    @FXML
    private TextField n4TextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int firstNum = Integer.parseInt(n1TextField.getText().toString());
        int secondNum = Integer.parseInt(n2TextField.getText().toString());
        int thirdNum = Integer.parseInt(n3TextField.getText().toString());
        int fourthNum = Integer.parseInt(n4TextField.getText().toString());
        if (firstNum != secondNum && firstNum != thirdNum && firstNum != fourthNum){
            resLabel.setText("Отличное число под №1");
        }else if (secondNum != firstNum && secondNum != thirdNum && secondNum != fourthNum){
            resLabel.setText("Отличное число под №2");
        }else if (thirdNum != firstNum && thirdNum != secondNum && thirdNum != fourthNum){
            resLabel.setText("Отличное число под №3");
        }else if (fourthNum != firstNum && fourthNum != secondNum && fourthNum != thirdNum){
            resLabel.setText("Отличное число под №4");
        }else if (firstNum == secondNum && secondNum == thirdNum && thirdNum == fourthNum){
            resLabel.setText("Все числа равны");
        }

    }

}





