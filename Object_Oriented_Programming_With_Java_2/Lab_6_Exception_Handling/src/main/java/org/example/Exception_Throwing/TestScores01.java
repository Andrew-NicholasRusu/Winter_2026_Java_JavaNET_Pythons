package org.example.Exception_Throwing;

/*
3. Exception throwing
 */

// a) Write a class named TestScores01. The class constructor should accept an array of test scores as its argument.
public class TestScores01 {
    private double[] scores;

    // Constructor with validation
    public TestScores01 (double[] scores){
        // c) Modify the TestScores01 class so that if any test score in the array is negative or greater than 100,
        // the class should not accept these scores and should throw an IllegalArgument Exception.
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] < 0 || scores[i] > 100) {
                    throw new IllegalArgumentException(
                            "Invalid score found. \nElement: " + i + " Score: " + scores[i]);
                }
            }
            this.scores = scores;
            }

            // The class should also have a getAverage() method that returns the average of the test scores.
            public double getAverage () {
                double sum = 0;
                for (double score : scores) {
                    sum += score;
                }
                return sum / scores.length;

            }

            // b) Demonstrate the class in a program.
            public static void main(String[] args) {
                // Use these arrays:
                double[] badScores = {97.5, -66.7, 88.0, 101.0, 99.0};
                double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};

                // Bad Scores
                try {
                    new TestScores01(badScores);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }

                // Good Scores
                TestScores01 test1 = new TestScores01(goodScores);
                System.out.printf("The average of the good scores is: %.2f%n", test1.getAverage());
            }
        }
// d) Demonstrate the class again and ensure that you get the following output:
    // Invalid score found.
    // Element: 1 Score: -66.7
    // The average of the good scores is 90.24

