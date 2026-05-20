/**
 * 1. Write a recursive method, called m_method(), to compute the following series:
 * m(i) = 1 + 1 / 2 + 1 / 3 + 1 / 4 ... +1/i.,.,
 */

public class Lab10P1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
        System.out.printf("m(%d) = %.2f\n", i, m_method(i));
        }
    }

    public static double m_method(int i) {
        double result;
        if (i <= 0){ // error case
            System.out.println("m_method is not defined for " + i);
            result = 0;
        }
        else if (i == 1){ // base case
            result = 1.0;
        }
        // recursive case
        else {
            System.out.printf("calling m_method(%d) \n", i - 1);
            result = m_method(i - 1) + (1.0 / i); // m_method (i - 1) is the recursive call
        }
        return result;
    }
}
