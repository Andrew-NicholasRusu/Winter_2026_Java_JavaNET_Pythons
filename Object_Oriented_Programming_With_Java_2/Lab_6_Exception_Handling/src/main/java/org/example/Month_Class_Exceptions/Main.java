package org.example.Month_Class_Exceptions;

// D) Demonstrate the classes in a program. First, use the no-argument Constructor.
// Then use a loop and set the month number to the values 0 through 13.
public class Main {
    public static void main(String[] args) {
        Month month = new Month();
        System.out.println("Using No-argument constructor: Month " + month.getMonthNumber() + " is " + month.getMonthName());
        System.out.println();

        // Loop and set the month number to 0 through 13
        for (int i = 0; i <= 13; i++) {
            try {
                month.setMonthNumber(i);
                System.out.println("Month " + month.getMonthNumber() +
                        " is " + month.getMonthName());
            } catch (InvalidMonthNumberException e) {
                // Message must match the required output exactly
                System.out.println(e.getMessage());
            }
        }
    }
}

// The output should be:
// Error - Invalid number given for the month: 0
// Month 1 is January
// Month 2 is February
// Month 3 is March
// Month 4 is April
// Month 5 is May
// Month 6 is June
// Month 7 is August
// Month 8 is September
// Month 9 is September
// Month 10 is October
// Month 11 is November
// Month 12 is December
// Error - Invalid number given for the month: 13
