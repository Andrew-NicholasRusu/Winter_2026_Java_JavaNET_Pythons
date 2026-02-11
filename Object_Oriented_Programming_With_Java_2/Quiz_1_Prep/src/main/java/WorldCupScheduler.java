// Demonstrate the class by writing a separate class called WorldCupScheduler (driver class) that:
    //1. Creates four WorldCupMatch objects representing matches from the 2026 FIFA World Cup in Cananda.
    //2. Stores the objects in an ArrayList called "schedule"
    //3. Removes the second match from the ArrayList
    //4. Writes a loop to display the details of each remaining match in the ArrayList as shown.

// Hint: here is how to create a date object (LocalDate.of(2026, 6, 12))

import java.time.LocalDate;
import java.util.ArrayList;

public class WorldCupScheduler {
    public static void main(String[] args) {
        // Create four WorldCupMatch objects representing matches from the 2026 FIFA World Cup in Cananda.
        WorldCupMatch game1 = new WorldCupMatch("CANADA", "UEFA PLAYOFF A", "BMO FIELD, TORONTO", LocalDate.of(2026, 6, 12));
        WorldCupMatch game2 = new WorldCupMatch("ARGENTINA", "CHILE", "BMO FIELD, TORONTO", LocalDate.of(2026, 6, 20));
        WorldCupMatch game3 = new WorldCupMatch("CANADA", "SWITZERLAND", "BC PLACE, VANCOUVER", LocalDate.of(2026, 6, 24));
        WorldCupMatch game4 = new WorldCupMatch("SPAIN", "PERU", "BC PLACE, VANCOUVER", LocalDate.of(2026, 6, 28));
        System.out.println("Original Schedule:");
        System.out.println(game1);
        System.out.println(game2);
        System.out.println(game3);
        System.out.println(game4);
        System.out.println(); // space for part 2

        // Stores the objects in an ArrayList called "schedule"
        ArrayList<WorldCupMatch> schedule = new ArrayList<>();
        // Can we use String instead of WorldCupMatch in the ArrayList?
        // No, because we want to store WorldCupMatch objects in the ArrayList, not Strings. 
        // If we use String, we will not be able to store the details of the matches in the ArrayList, 
        // we will only be able to store the names of the matches, which is not what we want.
        schedule.add(game1);
        schedule.add(game2);
        schedule.add(game3);
        schedule.add(game4);
        // Removes the second match from the ArrayList
        schedule.remove(1); 

        // for loop example
        System.out.println("Remaining World Cup Matches in Canada:");
        for (int i = 0; i < schedule.size(); i++) {
            System.out.println(schedule.get(i)); 
            // this will call the toString method of the WorldCupMatch class to display the details of each match
        }

        // nested loop example:

            // for (WorldCupMatch match : schedule) {
            //     System.out.println(match); 
            // }

    }
}
