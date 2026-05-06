/**
 * 3. Write a recursive method that find the number of occurrences of a specified letter in a string using the 
 * following method header: public static int count (String str, char a)
 */

// For example, count("Welcome" 'e') returns 2.
// Write a test program that prompts the user to enter a string and a character, and displays the numbers of occurrences 
// for the character in the string. Make sure to add comments to highlight your "error case", "base case", and "recursive case".
import java.util.*;

public class NumberOfOccurrences {
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
        int result = -1;
        if (str == null) {
            System.out.println("The count method is not defined for being null"); // error case
        } else if (str.length() == 0) {
            System.out.println("The count method is not defined for being empty"); // base case
        } else {
            System.out.printf("calling count(%s, %c) \n", str.substring(1), a); // recursive case
            // in here, we are making call to count the number of occurrences of a character.
            result = count(str.substring(1), a);
            if (str.charAt(0) == a) { // if the first character of the string is the same as the character we are looking for, we add 1 to the result.
                result++;
            }
        }
        return result;
    }
}
