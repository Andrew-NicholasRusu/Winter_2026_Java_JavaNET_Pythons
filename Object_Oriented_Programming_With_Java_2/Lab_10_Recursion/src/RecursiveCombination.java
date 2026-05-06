/**
 * 4. Combinations refer to the combination of n things taken p at a time without repetition.
 * A recursive definition of C(n, p) is: C(n, 0) - C(n, n) = 1, otherwise C(n, p) = C(n-1, p) + C(n-1, p-1).
 */

// Write a method public static long C (Long n, long p) that computes and retruns C(n, p).
// Make sure to add comments to highlight your "error case", "base case", and "recursive case."

public class RecursiveCombination {
    public static void main(String[] args) {
        long result = C(5, 2);
        System.out.printf("Result of C(%d, %d) is %d \n", 5, 2, result);
        
    }

    public static long C(long n, long p) {
        long result = -1;
        if (n < 0 || p < 0) {
            System.out.println("C is not defined for n = " + n + " and p = " + p); // error case on line 17
        } else if (p == 0 || p == n) {
            result = 1; // base case on line 20
        } else {
            System.out.printf("calling C(%d, %d) and C(%d, %d) \n", n - 1, p, n - 1, p - 1); // recursive case on line 23
            // in here, we are making two recursive calls to C method, one is C(n - 1, p) and the other is C(n - 1, p - 1).
            result = C(n - 1, p) + C(n - 1, p - 1); // the result is the sum of the two recursive calls.
        }
        return result;
    }
}
