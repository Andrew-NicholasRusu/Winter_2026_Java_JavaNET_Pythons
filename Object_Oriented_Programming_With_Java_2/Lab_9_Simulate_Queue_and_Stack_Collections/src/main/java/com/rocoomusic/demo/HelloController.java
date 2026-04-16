package com.rocoomusic.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.util.LinkedList;
import java.util.Queue;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField inputField;

    @FXML
    private HBox queueController;

    private Queue<String> queue = new LinkedList<>();

    @FXML
    protected void onEnqueueClick() {
        String value = inputField.getText().trim();
        if (!value.isEmpty()) {
            enqueue(value);
            inputField.clear();
            messageLabel.setText(""); // clears the message when successful
        }

    }

    private void enqueue(String value) {
        queue.add(value);

    }

    @FXML
    protected void onDequeueClick() {
        dequeue();
    }

    private void dequeue() {
        if (queue.isEmpty()) {
            System.out.println("There is nothing to dequeue!");
            messageLabel.setText("There is nothing to dequeue!");
        } else {
            queue.pull();
            redrawQueue();
            messageLabel.setText("");
        }
    }

    private void redrawQueue() {
        queueContainer.getChildren().clear();
        for(String item: queue) {
            Label itemLabel = new Label(item);
            itemLabel.getStyleClass().add("queue-item");
            queueContainer
        }
    }
}