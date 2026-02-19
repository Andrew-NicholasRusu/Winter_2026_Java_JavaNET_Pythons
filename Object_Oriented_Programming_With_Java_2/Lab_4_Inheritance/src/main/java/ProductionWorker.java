import java.time.LocalDate;

public class ProductionWorker extends Employee {

    // Attributes
    public static final int DAY_SHIFT = 1; 
    public static final int NIGHT_SHIFT = 2;
    // Constants for shift types
    private int shift;
    private double payRate;

    // Constructors
    // Write one constructor with all arguments and one without any, and the appropriate
    // accessor and mutator methods for the class.

    public ProductionWorker() {
        // The default super() constructor will be called automatically
        // However, I like to make explicit calls always.
        super(); // Make an explicit call to super
        this.shift = DAY_SHIFT;
        this.payRate = 0.0;
    }

    public ProductionWorker(String name, String number, LocalDate hireDate, int shift, double payRate) {
        super (name, number, hireDate); // Calls the superclass constructor to initialize the inherited attributes from Employee
        this.shift = shift;
        this.payRate = payRate;
    }

    // Getters and Setters
    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate){
        this.payRate = payRate;
    }

    // This is not in the UML.
    public String getShiftDisplay() {
        return getShift() == DAY_SHIFT ? "Day" : "Night";
        // This method returns a string representation of the shift type based on the value of the shift attribute.
    }

    // Other methods
    public String toString() {

        return super.toString() + "\n" + 
        // super.toString() calls the toString method of the superclass (Employee) to include the employee's name, number, and hire date in the output.
        "Shift: " + getShiftDisplay() + "\n" +
        String.format("Hourly Pay Rate: $%.2f" , this.getPayRate());
        // The String.format method is used to format the hourly pay rate as a currency value with two decimal places.
    }
}











