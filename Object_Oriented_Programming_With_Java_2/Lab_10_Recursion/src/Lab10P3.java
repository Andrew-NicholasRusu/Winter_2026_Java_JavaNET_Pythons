/**
 * 3. Write a recursive method that find the number of occurrences of a specified letter in a string using the 
 * following method header: public static int count (String str, char a)
 */

// For example, count("Welcome" 'e') returns 2.
// Write a test program that prompts the user to enter a string and a character, and displays the numbers of occurrences 
// for the character in the string. Make sure to add comments to highlight your "error case", "base case", and "recursive case".
import java.util.*;

public class Lab10P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = sc.nextLine();
        System.out.println("Please enter a character:");
        char a = sc.nextLine().charAt(0);
        int result = count(str, a);
        System.out.println("The selected string has " + result + " occurrences in total.");
    }

    public static int count (String str, char a) {
        int result; 
        // error case to handle null input.
        if (str == null) {
            return 0;
        } else if (str.length() == 0) {
            // base case to handle empty string.
            return 0;
        } else {
            // RecursiveCase to check the first character and then call the method again for the rest of the string
            
            result = 0;
            if (str.charAt(0) == a) { // if the first character of the string is the same as the character we are looking for, we add 1 to the result.
                result = 1;
            }
            return result + count(str.substring(1), a);
        }
    }
}
