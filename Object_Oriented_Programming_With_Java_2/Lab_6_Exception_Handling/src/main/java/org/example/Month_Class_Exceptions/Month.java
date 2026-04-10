package org.example.Month_Class_Exceptions;

/*
4. Month Class Exceptions
 */

// a) Write a Month class that holds information about the month according to the
// UML diagram given.
public class Month {
    private int monthNumber; // attribute

    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    // NO-ARG CONSTRUCTOR
    public Month() {
        this.monthNumber = 1; // 1 = January
    }
    // The no-argument constructor Month() should set the month to January.

    // ARG CONSTRUCTOR
    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new InvalidMonthNumberException(monthNumber);
        }
        this.monthNumber = monthNumber;
    }

    public Month(String name) {
        if (name == null) {
            this.monthNumber = 1; // Default to January instead of throwing
            return;
        }
        String normalized = name.trim().toLowerCase();

        int index = -1;
        for (int i = 0; i < MONTH_NAMES.length; i++) {
            if (MONTH_NAMES[i].toLowerCase().equals(normalized)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            this.monthNumber = 1;
        } else {
            this.monthNumber = index + 1;
        }
    } // The third Constructor takes the month parameter by name: January, February.
    // It should work for lower and upper case.

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            throw new InvalidMonthNumberException(monthNumber);
        }
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return this.monthNumber;
    }

    public String getMonthName() {
        return MONTH_NAMES[monthNumber - 1];
    }

    @Override
    public String toString() {
        return "Month " + this.getMonthNumber() + " is " + this.getMonthName();
    }

    // equals(month2 : Month) : boolean
    public boolean equals(Month month2) {
        if (month2 == null) {
            return false;
        }
        return this.getMonthNumber() == month2.getMonthNumber();
    }

    // greaterThan(month2 : Month) : boolean
    public boolean greaterThan(Month month2) {
        if (month2 == null) {
            return false;
        }
        return this.getMonthNumber() > month2.getMonthNumber();
    }

    // lessThan(month2 : Month) : boolean
    public boolean lessThan(Month month2) {
        return this.getMonthNumber() < month2.getMonthNumber();
    }
    // c) Modify the Month class so it throws the appropriate exception when either of these errors occurs.
}
