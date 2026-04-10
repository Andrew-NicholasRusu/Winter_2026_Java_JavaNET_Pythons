package org.example.FileProcessingSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProcessingMain {

    public static void main(String[] args) {
        System.out.print("Enter the filename: ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine().trim(); //.trim is used to not include unnecessary spaces
        sc.close();

        Scanner fileScanner = null; // Purpose?
        try {
        File myFile = new File(filename);
        sc = new Scanner(myFile);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            process_data(line);
        }
    } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (NegativeNumberException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage() + "");
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
            System.out.println("File closed successfully.");
            System.out.println("Execution completed (finally block executed).");
            }
        }
        /**
         * Converts data to integer, computes 100/num.
         * Handles: NegativeNumberException (throws), NumberFormatException, ArithmeticException.
         */

public static void process_data(String data) throws NegativeNumberException {
    try {
        // convert to integer
        int number = Integer.parseInt(data); // might fail because of invalid input
        // check if the number is negative and throws an exception
        if (number < 0) {
            throw new NegativeNumberException(number);
        }
        // compute 100/num
        int result = 100 / number;
        System.out.println("Processed: " + number + "-> Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Data Error: Invalid number format -> " + data);
        } catch (ArithmeticException e) {
            System.out.println("Math Error: Division by zero is not allowed.");
        }
    }
}
