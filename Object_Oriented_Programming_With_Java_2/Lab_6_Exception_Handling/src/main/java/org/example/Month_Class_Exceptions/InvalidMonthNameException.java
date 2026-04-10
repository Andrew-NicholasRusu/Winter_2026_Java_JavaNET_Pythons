package org.example.Month_Class_Exceptions;

// b) Write exception classes for the following error conditions:

// #2: InvalidMonthNameException: An invalid string is given for the name of the month.

public class InvalidMonthNameException extends RuntimeException {

    public InvalidMonthNameException() {
        super();
    }
    public InvalidMonthNameException(String name) {
        super("Error - Invalid name given for the month: " + name);
    }
}
