/**
 * 4. Combinations refer to the combination of n things taken p at a time without repetition.
 * A recursive definition of C(n, p) is: C(n, 0) - C(n, n) = 1, otherwise C(n, p) = C(n-1, p) + C(n-1, p-1).
 */

// Write a method public static long C (Long n, long p) that computes and retruns C(n, p).
// Make sure to add comments to highlight your "error case", "base case", and "recursive case."

public class Lab10P4 {
    public static void main(String[] args) {
        long result = C(5, 2);
        System.out.printf("Result of C(%d, %d) is %d \n", 5, 2, result);
    }

    public static long C(long n, long p) {
        // Error cases
        if (n < 0 || p < 0) {
            System.out.println("C is not defined for n = " + n + " and p = " + p);
            return 0;
        }
        // Invalid case
        if (p > n) {
            return 0;
        }
        // Base cases
        if (p == 0 || p == n) {
            return 1;
        }
        // Recursive case
        return C(n - 1, p) + C(n - 1, p - 1);
    }
}
