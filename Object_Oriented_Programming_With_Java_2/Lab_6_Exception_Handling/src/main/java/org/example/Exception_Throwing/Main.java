package org.example.Exception_Throwing;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        double[] badScores = {97.5, -66.7, 38.0, 77.0, 99.0};
        double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};

        try {
            TestScores01 badStudent = new TestScores01(badScores);
            System.out.println("Bad students average: " + badStudent.getAverage());
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
        try {
            TestScores01 goodStudent = new TestScores01(goodScores);
            System.out.println("Good students average: " + goodStudent.getAverage());
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
    }
}

