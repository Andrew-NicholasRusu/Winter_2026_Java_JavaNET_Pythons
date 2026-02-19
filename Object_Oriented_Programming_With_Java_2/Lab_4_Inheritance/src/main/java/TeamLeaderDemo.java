import java.time.LocalDate;

public class TeamLeaderDemo {
    public static void main(String[] args) {
        System.out.println();

        TeamLeader leader1 = new TeamLeader("John Smith", "123-A",
                LocalDate.of(2005, 11, 15), 1, 16.50, 500.00, 5.0, 2.5);

        TeamLeader leader2 = new TeamLeader("Joan Jones", "222-L",
                LocalDate.of(2005, 12, 12), 2, 18.50, 600.00, 7.0, 3.5);

        System.out.println("Here's the first team leader. \n" + leader1); // The toString method of the TeamLeader class is called 
        // implicitly when the object is printed, which includes the employee's name, number, hire date, shift type, hourly pay rate, 
        // monthly bonus, required training hours, and training hours attended in the output.
        System.out.println();
        System.out.println("Here's the second team leader. \n" + leader2);


    }
}
