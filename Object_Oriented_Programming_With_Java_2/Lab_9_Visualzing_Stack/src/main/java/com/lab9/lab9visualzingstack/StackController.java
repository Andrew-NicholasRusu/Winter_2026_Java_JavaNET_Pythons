package com.lab9.lab9visualzingstack;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.util.Stack;

public class StackController {

    @FXML
    private Label messageLabel;

    @FXML
    private TextField inputField;

    @FXML
    private VBox stackContainer;

    private Stack<String> stack = new Stack<>();

    @FXML
    protected void onPushClick() {
        String value = inputField.getText().trim();

        if (value.isEmpty() || value == null) {
            messageLabel.setText("Please enter a value to push!");
            messageLabel.setStyle("-fx-text-fill: red");
            return;
        }

        stack.push(value.trim());
        inputField.clear();
        messageLabel.setText("Top");
        messageLabel.setStyle("");
        if (!messageLabel.getStyleClass().contains("stack-label")) {
            messageLabel.getStyleClass().add("stack-label");
        }
        redrawStack();
    }

    @FXML
    protected void onPopClick() {
        if (stack.isEmpty()) {
            messageLabel.setText("Nothing to pop. Stack Underflow!");
            messageLabel.setStyle("-fx-text-fill: red");
        } else {
            String poppedValue = stack.pop();
            messageLabel.setText("Top");
            redrawStack();
            messageLabel.setText("Popped \"" + poppedValue + "\" from the stack");
            messageLabel.setStyle("-fx-text-fill: green");
        }
    }

    @FXML
    protected void onClearClick() {
        if (stack.isEmpty()) {
            messageLabel.setText("Stack is already empty!");
            messageLabel.setStyle("-fx-text-fill: red");
        } else {
            stack.clear();
            redrawStack();
            messageLabel.setText("Stack cleared successfully!");
        }
    }

    private void redrawStack() {
        stackContainer.getChildren().clear();

        // Display items from top to bottom
        for (int i = stack.size() - 1; i >= 0; i--) {
            String item = stack.get(i);
            Label itemLabel = new Label((item));
            itemLabel.getStyleClass().add("stack-item");
            stackContainer.getChildren().add(itemLabel);

        }
    }
}