/**
 * 1. Write a recursive method, called m_method(), to compute the following series:
 * m(i) = 1 + 1 / 2 + 1 / 3 + 1 / 4 ... +1/i.,.,
 */

public class m_methodClass {

    public static void main(String[] args) {

        double result = m_method(10);
        System.out.printf("Result of m_method(%d) is %f \n", 10, result);
    }

    public static double m_method(int i) {
        double result =- 1;
        if (i <= 0) // error case
            System.out.println("m_method is not defined for " + i);
        else if (i == 1) // base case
            result = 1;
        else {
            System.out.printf("calling m_method(%d) \n", i - 1);
            result = m_method(i - 1) + (1.0 / i); // m_method (i - 1) is the recursive call
        }
        return result;
    }
}
