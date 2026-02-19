import java.time.LocalDate;

public class ProductionWorkerDemo {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome!");
        Employee employee1 = new Employee("Bella", "123-B", LocalDate.now()); // creates a new object

        // Testing
        System.out.println("Validity of 123-B is " + employee1.isValidEmpNum("123-B"));
        System.out.println("Validity of 123B is " + employee1.isValidEmpNum("123B"));
        System.out.println("Validity of 1X3-B is " + employee1.isValidEmpNum("1X3-B"));
        System.out.println("Validity of X23-B is " + employee1.isValidEmpNum("X23-B"));
        System.out.println("Validity of 12X-B is " + employee1.isValidEmpNum("12X-B"));
        System.out.println("Validity of 123-9 is " + employee1.isValidEmpNum("123-9"));
        System.out.println("Validity of 123 B is " + employee1.isValidEmpNum("123 B"));
        System.out.println("Validity of 123-Z is " + employee1.isValidEmpNum("123-Z"));
        System.out.println("Validity of 123- is " + employee1.isValidEmpNum("123-"));
        System.out.println("Validity of 123-AM is " + employee1.isValidEmpNum("123-AM"));

        System.out.println();
        System.out.println("Employee detail: \n" + employee1);
        System.out.println();

        ProductionWorker productionWorker = new ProductionWorker("John Smith", "123-A",
                LocalDate.of(2005, 11, 15), 1, 16.50);
        ProductionWorker productionWorker2 = new ProductionWorker("Joan Jones", "222-L",
                LocalDate.of(2005, 12, 12), 2, 18.50);

        System.out.println("Here's the first production worker. \n" + productionWorker);
        // The toString method of the ProductionWorker class is called implicitly when the object is printed, 
        // which includes the employee's name, number, hire date, shift type, and hourly pay rate in the output.
        System.out.println();
        System.out.println("Here's the second production worker. \n" + productionWorker2);




    }
}
