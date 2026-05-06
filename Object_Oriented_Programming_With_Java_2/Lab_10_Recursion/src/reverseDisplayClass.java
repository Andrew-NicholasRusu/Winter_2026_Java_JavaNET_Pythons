/**
 * 2. write a recursive method, called reverseDisplay(), that displays a string reversely on the console using the 
    // following header: public static void reverseDisplay(String value)
*/

// For example, reverseDisplay("abcd") displays dcba. Write a test program that prompts the user to enter a string and displays its reversal.
// Make sure to add comments to highlight your "error case", "base case", and "recursive case".
import java.util.*;

public class reverseDisplayClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string value:");
        String value = sc.nextLine();
        reverseDisplay(value);        
    }

    public static  void reverseDisplay(String value) {
        if (value == null) { // here is the error case
            System.out.println("reverseDisplay is not defined for null");
        } else if (value.length() == 0) {
            System.out.println("reverseDisplay is not defined for empty string"); // here is the base case
        } else {
            System.out.printf("calling reverseDisplay(%s) \n", value.substring(1)); // here is the recursive case
            reverseDisplay(value.substring(1));
            System.out.print(value.charAt(0));
        }
    }
}
