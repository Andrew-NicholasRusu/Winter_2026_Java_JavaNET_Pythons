/**
 * 2. write a recursive method, called reverseDisplay(), that displays a string reversely on the console using the 
    // following header: public static void reverseDisplay(String value)
*/

// For example, reverseDisplay("abcd") displays dcba. Write a test program that prompts the user to enter a string and displays its reversal.
// Make sure to add comments to highlight your "error case", "base case", and "recursive case".
import java.util.*;

public class Lab10P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value:");
        String value = sc.nextLine();
        reverseDisplay(value);
        System.out.println(); // optional: add newline at end
    }

    public static void reverseDisplay(String value) {
        // Error case
        if (value == null) {
            System.out.println("reverseDisplay is not defined for null");
            return;
        }
        // Base case
        else if (value.length() == 0) {
            return;
        }
        // Recursive case
        else {
            reverseDisplay(value.substring(1));
            System.out.print(value.charAt(0));
        }
    }
}

