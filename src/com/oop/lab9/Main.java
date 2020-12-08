package com.oop.lab9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    private boolean isNotValid(TextField input) {
        try {
            double val = Double.parseDouble(input.getText());
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Divide Calculator");
        TextField dividend = new TextField();
        TextField divisor = new TextField();
        Label resultLabel = new Label();
        Label errorLabel = new Label();
        Button button = new Button();
        button.setText("Result");
        button.setOnAction(actionEvent ->
        {
            try
            {
                double dividendValue = Double.parseDouble(dividend.getText());
                double divisorValue = Double.parseDouble(divisor.getText());

                double resultValue = dividendValue / divisorValue;
                resultLabel.setText( Double.toString(resultValue) );

                if (divisorValue == 0)
                {
                    throw new ArithmeticException();
                }

                if (divisorValue == 13)
                {
                    throw new unluckyException();
                }
            } catch (ArithmeticException e) {
                errorLabel.setText("Division by 0 is not possible");

            } catch(NumberFormatException e) {
                if (isNotValid((dividend))) {
                    errorLabel.setText("Invalid Dividend \n");
                }
                if (isNotValid((divisor))) {
                    errorLabel.setText(("Invalid Divisor \n"));
                }
                if(isNotValid((dividend)) && isNotValid((divisor)) ) {
                    errorLabel.setText("Invalid inputs ");
                }
            } catch(Exception e) {
                errorLabel.setText(e.getMessage());
            }
        });
        VBox calculator = new VBox(1);
        calculator.getChildren().addAll(dividend, divisor, button, resultLabel, errorLabel);
        stage.setScene(new Scene(calculator, 300, 140));
        stage.show();
    }

}
