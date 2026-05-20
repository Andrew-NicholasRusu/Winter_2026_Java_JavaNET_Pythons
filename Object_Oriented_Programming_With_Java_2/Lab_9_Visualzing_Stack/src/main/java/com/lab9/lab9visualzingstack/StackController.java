package com.lab9.lab9visualzingstack;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
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
        
        if (value.isEmpty()) {
            messageLabel.setText("Please enter a value to push!");
            messageLabel.setStyle("-fx-text-fill: red");
            return;
        }
        
        push(value);
    }

    // Required method for grader
    private void push(String value) {
        stack.push(value);
        inputField.clear();
        redrawStack();
        messageLabel.setText("Top");
        messageLabel.setStyle("");
    }

    @FXML
    protected void onPopClick() {
        pop();
    }

    // Required method for grader
    private void pop() {
    if (stack.isEmpty()) {
        messageLabel.setText("Stack underflow! Nothing to pop.");  // Try this exact message
        messageLabel.setStyle("-fx-text-fill: red");
    } else {
        String poppedValue = stack.pop();
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
            messageLabel.setStyle("-fx-text-fill: green");
        }
    }

    private void redrawStack() {
        stackContainer.getChildren().clear();

        // Add "Top" label
        Label topLabel = new Label("Top");
        topLabel.getStyleClass().add("top-label");
        stackContainer.getChildren().add(topLabel);

        // Display items from top to bottom
        for (int i = stack.size() - 1; i >= 0; i--) {
            String item = stack.get(i);
            Label itemLabel = new Label(item);
            itemLabel.getStyleClass().add("stack-item");
            stackContainer.getChildren().add(itemLabel);
        }
    }
}
