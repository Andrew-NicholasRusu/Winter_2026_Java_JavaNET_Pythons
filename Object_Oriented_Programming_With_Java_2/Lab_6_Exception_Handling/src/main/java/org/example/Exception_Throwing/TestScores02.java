package org.example.Exception_Throwing;

// f) Modify the class you wrote in the previous problem and call it TestScores02 so that it throws an InvalidTestScore
// exception if any of the test scores in the array are invalid.

public class TestScores02 {
    private double[] scores;

    public TestScores02 (double[] scores) throws InvalidTestScore{
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < 0 || scores[i] > 100) {
                throw new InvalidTestScore(i, scores[i]);
            }
        }
        this.scores = scores;
    }

    public double getAverage () {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;

    }

    // g) Same output as TestScores01 demo
    public static void main(String[] args) {
        double[] badScores = {97.5, -66.7, 88.0, 101.0, 99.0};
        double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};

        // Bad Scores
        try {
            new TestScores02(badScores);
        } catch (InvalidTestScore e) { // InvalidTestScore instead of IllegalArgumentException
            System.out.println(e.getMessage());
        }

        // Good Scores
        TestScores02 test1 = new TestScores02(goodScores);
        System.out.printf("The average of the good scores is: %.2f%n", test1.getAverage());

    // Arrangement of stuff is changed in TestScores02, which is important.
    }
}


