package ru.shafigullina.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
            int N = Integer.parseInt(nTextField.getText().toString());
            int firstDigit = N / 100;
            int secondDigit = (N / 10) % 10;
            int thirdDigit = N % 10;
            if (N < 100 || N > 999) {
                resLabel.setText("Ошибка, введите трехзначное число");
            } else if (firstDigit == secondDigit && secondDigit == thirdDigit) {
                resLabel.setText("Все цифры одинаковые");
            } else if (firstDigit != secondDigit || secondDigit != thirdDigit) {
                resLabel.setText("Цифры разные");
            }
        }
    }
