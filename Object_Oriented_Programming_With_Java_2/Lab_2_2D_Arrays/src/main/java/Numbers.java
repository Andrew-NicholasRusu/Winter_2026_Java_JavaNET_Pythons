// Question #1:

import java.util.Random; // You must have this import statement to use the Random class in your code

public class Numbers {
    public static void main(String[] args) {
        // Declare a 2D array named numbers with 30 rows and 40 columns, the data type of the array is int.
        int[][] numbers;
        numbers = new int[30][40];
        // b) Write the necessary code to randomly initialize the numbers array
        // with integer values between 0 and 200 inclusively.
        Random rand = new Random();
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                numbers [row][column] = rand.nextInt(201); // 0 to 200
            }
        }
        // c) Write the necessary code to assign the value 28 to the element in row 10, column 6 of the numbers array.
        numbers [10][6] = 28;

        // d) Write the code to assign the value 45 to the last element of the numbers array
        numbers[29][39] = 45;

        // e) Write the necessary code to print the lowest values in the numbers array.
        int min = numbers[0][0];
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                if (numbers[row][column] < min) {
                    min = numbers[row][column];
                }
            }
        }
        System.out.println("Lowest values = " + min);

        // f) Write the necessary code to print the contents of the numbers array, one row per line
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.print(numbers[row][column] + " "); // Print one row
            }
            System.out.println();
        }

        // g) Write the necessary code to print the sum of the values in the first row
        // of the numbers array.
        int total = 0;
        for (int column = 0; column < numbers[0].length; column++) { // 0 = index 0 = first row / element
                total += numbers[0][column];
            }
        System.out.println("Sum of the first row = " + total);
        }
    }