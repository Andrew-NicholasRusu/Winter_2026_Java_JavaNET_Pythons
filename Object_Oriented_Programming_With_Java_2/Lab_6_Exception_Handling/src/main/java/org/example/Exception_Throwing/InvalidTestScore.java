package org.example.Exception_Throwing;

// e) Write an exception class named InvalidTestScore
public class InvalidTestScore extends RuntimeException {

    // + InvalidTestScore()
    public InvalidTestScore() {
        super();
    }

    // + InvalidTestScore(int element, double score)
    public InvalidTestScore(int element, double score) {
        super("Invalid score found.\nElement: " + element + " Score: " + score);
    }
}