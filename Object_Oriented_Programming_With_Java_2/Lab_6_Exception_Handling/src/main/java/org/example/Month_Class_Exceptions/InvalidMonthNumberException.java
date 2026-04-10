package org.example.Month_Class_Exceptions;

// b) Write exception classes for the following error conditions:

// #1: InvalidMonthNumberException class: A number less than 1 or greater than 12 is given for the month number.

public class InvalidMonthNumberException extends RuntimeException {

    public InvalidMonthNumberException() {
        super();
    }

    public InvalidMonthNumberException(int monthNumber) {
        super("Error - Invalid number given for the month: " + monthNumber);
    }
}
