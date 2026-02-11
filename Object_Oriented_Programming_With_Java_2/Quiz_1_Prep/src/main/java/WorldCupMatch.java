// Consider a class name WorldCupMatch that has the following private attributes:
// homeTeam: The homeTeam is a String that holds the name of the home team
// awayTeam: The awayTeam is a String that holds the name of the away team
// venue: The venue is a String that holds the name of the stadium where the match is played
// matchDate: The matchDate is a LocalDate that holds the date of the match

// in addition, the WorldCupMatch class has the following methods:
// Aa All-argument Constructor that initializes all the attributes of the class
// Override the toString method to return a string representation of the object in the format 
// Etc
import java.time.LocalDate;

public class WorldCupMatch {
    // Write the java code for the WorldCupMatch class that includes all the attributes and methods described above.
    private String homeTeam, awayTeam, venue;
    private LocalDate matchDate;

    public WorldCupMatch(String homeTeam, String awayTeam, String venue, LocalDate matchDate) {
        this.homeTeam = homeTeam; 
        // the keyword above is used to refer to the current object, it is used to distinguish between the instance variable 
        // and the parameter variable that have the same name.
        this.awayTeam = awayTeam;
        this.venue = venue;
        this.matchDate = matchDate;
    }   

    // Accessor methods (getters)
    public String getHomeTeam() {
        return homeTeam;
    }
    public String getAwayTeam() {
        return awayTeam;
    }
    public String getVenue() {
        return venue;
    }
    public LocalDate getMatchDate() {
        return matchDate;
    }

    // Mutator methods (setters)
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    // toString method
    @Override
    public String toString() { 
        // the @Override annotation is used to indicate that we are overriding the toString method from the Object class
        return "Game: " + homeTeam + " vs " + awayTeam + " at " + venue + " on " + matchDate;
        // returns a string representation of the object in the format "Game: homeTeam vs awayTeam at venue on matchDate"
    }

}
