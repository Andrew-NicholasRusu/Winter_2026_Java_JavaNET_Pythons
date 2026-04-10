package org.example.FileProcessingSystem;

public class NegativeNumberException extends Exception {

    public NegativeNumberException() {
        super("Negative number not allowed.");
    }

    public NegativeNumberException(int number) {
        super("Negative number not allowed: " + number);
    }

    public NegativeNumberException(double number) {
        super ("Negative number found: " + number);
    }
}
