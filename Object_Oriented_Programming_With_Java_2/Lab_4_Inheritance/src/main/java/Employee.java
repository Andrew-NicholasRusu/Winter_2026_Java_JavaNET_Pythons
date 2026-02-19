import java.time.LocalDate;

public class Employee {
    // Attributes
    private String employeeName, employeeNumber;
    private LocalDate hireDate;

    // Constructor
    public Employee () {
        this.employeeName = "";
        this.employeeNumber = "";
    }

    // This constructor is not in the UML
    public Employee (String name, String number) {
        this.employeeName = name;
        if (this.isValidEmpNum(number)) {
            // If the provided employee number is valid according to the isValidEmpNum method, 
            // it assigns the value to the employeeNumber attribute.
            this.employeeNumber = number;
        } else {
            System.out.println("Employee number is Invalid.");

            this.hireDate = LocalDate.now();
        }
    }

    public Employee (String name, String number, LocalDate hireDate) { 
        // LocalDate is a class in the java.time package that represents a date without time information.
        this.employeeName = name;
        this.employeeNumber = number;
        this.hireDate = hireDate;
    }

    // Getters and Setters
    public String getName() {
        return employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    // Other Methods
    public boolean isValidEmpNum(String e) {
        boolean result = true;
        // Check if employee number "e" is valid
        // Employee number in the format XXX-L, where each x is a digit
        // within the range 0-9, and the L is a letter within the range A-M
        if ((e.length()!= 5) ||
            !('0' <= e.charAt(0) && e.charAt(0) <= '9') || // Character.isDigit(e.charAt(0))
            !('0' <= e.charAt(1) && e.charAt(1) <= '9') || // Character.isDigit(e.charAt(1))
            !('0' <= e.charAt(2) && e.charAt(2) <= '9') || // Character.isDigit(e.charAt(2))
                    (e.charAt(3) !='-') ||
            !('A' <= e.charAt(4) && e.charAt(4) <= 'M')
            ){
            result = false;
            System.out.println("Invalid employee number.");
        }
        return result;
    }

    // Second version
        //    public boolean isValidEmpNumV2(String e) {
        //        boolean result = true;
        //        // Check if employee number "e" is valid
        //        // Employee number in the format XXX-L, where each x is a digit
        //        // within the range 0-9, and the L is a letter within the range A-M
        //        // The case of 123-B
        //        if (e.length()!= 5) {
        //            result = false;
        //            System.out.println("The length of employee number if not 5.");
        //        } else { // it has size 5
        //            // loop through all chars and check that they follow the rules
        //            for (int i = 0; i < e.length(); i++) {
        //                // Check that the forth char is indeed "-"
        //                if (i==3 && e.charAt(1) != '-') {
        //                    result = false;
        //                    break;
        //                } // Check that the 5th char is indeed between A and M.
        //                else if (i==4 && (e.charAt(i)<'A' || 'M' < e.charAt(i))) {
        //                    result = false;
        //                    break;
        //                } // finally the current char which e.charAt
        //                else if (e.charAt(i) < '0' || '9'< e.charAt(i)) {
        //                    result = false;
        //                    break;
        //                }
        //            }
        //        }
        //        return result;
        //    }

    // Third Version
        //    public boolean isValidEmpNumV3(String e) {
        //        boolean result = true;
        //        // Check if employee number "e" is valid
        //        // Employee number in the format XXX-L, where each x is a digit
        //        // within the range 0-9, and the L is a letter within the range A-M
        //        if (e.length()!= 5) {
        //            result = false;
        //            System.out.println("The length of employee number if not 5.");
        //        } else {  // it has a size 5
        //            if (e.charAt(3) == '-' || e.charAt(4) < 'A' || e.charAt(4)>'M'){
        //                result = false;
        //                System.out.println("THere is no \"-\" or the last char is not between A and M.");
        //            } else { // Check the first three letters and make sure they are digits.
        //                if ( !( '0' <= e.charAt(0) && e.charAt(0)>'9' &&
        //                        '0' <= e.charAt(1) && e.charAt(1)>'9' &&
        //                        '0' <= e.charAt(2) && e.charAt(2)>'9' )
        //                ) {
        //                    result = false;
        //                    System.out.println("The first three chars are not digits.");
        //                }
        //            }
        //        }
        //        return result;
        //    }

    public String toString() {
        // This method returns a string representation of the Employee object, including the employee's name, number, and hire date.
        return "Name: " + this.employeeName + "\n" +
                "Employee Number: " + this.employeeNumber + "\n" +
                "Hire Date: " + this.hireDate;
    }
}
























