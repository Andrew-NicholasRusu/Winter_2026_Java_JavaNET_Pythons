import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!\n");

        /// //////////////////////////////
        /// Problem 1
        /// /////////////////////////////
        Card c1 = new Card("hearts", "Ace"); 
        Card c2 = new Card("Diamonds", "King"); 
        Card c3 = new Card("Clubs", "7");
        Card c4 = new Card("Diamonds", "2");

        ArrayList<Card> deck = new ArrayList<Card>(); // Create an empty ArrayList of Card objects
        deck.add(c1); // Add the Card objects to the ArrayList
        deck.add(c2);
        deck.add(c3);
        deck.add(c4);

        displayDeck(deck); // Display the deck using the displayDeck method, 
        // which takes an ArrayList of Card objects as a parameter and displays the cards in the deck

        deck.remove(2); // Removes the third Card object from the ArrayList. Display Deck.
        System.out.println("");
        System.out.println("Deck after removing index 2 (Clubs): ");
        displayDeck(deck);

        // Insert a new card (spades, 10) between (hearts, ace) (Diamonds, King). Display Deck.
        c1 = new Card("Spades", "10"); // Creates a new Card object with suit "Spades" and rank "10"
        deck.add(1, c1); // Inserts the new Card object at index 1 (between the first and second cards in the deck)
        System.out.println("");
        System.out.println("Deck after adding (spades, 10)");
        displayDeck(deck);

        /// /////////////////////////////////
        /// Problem 2
        /// ////////////////////////////////
        ArrayList<PhoneBookEntry> phonebook = new ArrayList<PhoneBookEntry>(); // Create an empty ArrayList of PhoneBookEntry objects
        phonebook.add(new PhoneBookEntry("Thomas", "543-619-7604")); // Add PhoneBookEntry objects to the ArrayList
        phonebook.add(new PhoneBookEntry("Micheal", "514-618-3404"));
        phonebook.add(new PhoneBookEntry("Andrew", "438-370-7009"));
        phonebook.add(new PhoneBookEntry("Silvia", "314-9067-2007"));
        phonebook.add(new PhoneBookEntry("Rose", "764-445-7205"));

        System.out.println("--- Phone Book Entries ---");
        for (PhoneBookEntry entry : phonebook) // Enhanced for loop to iterate through the ArrayList
        // This loop goes through each PhoneBookEntry object in the phonebook ArrayList
        // and assigns it to the variable entry for each iteration
            System.out.println("Name: " + entry.getName() + " | Phone Number: "+entry.getPhonenumber());
            // This prints the name and phone number of each entry in the phonebook 
            // using the accessor methods getName() and getPhonenumber()


        ////////////////////////////////////
        /// Problem 3
        ////////////////////////////////////
        // Declare an empty (do not define a size) ArrayList of Strings, call it cityList
        ArrayList<String> cityList = new ArrayList<String>(); // <String> specifies that this ArrayList will hold String objects
        System.out.println("");
        System.out.println("List of cities:");
        cityList.add("London"); // Adds the specified city to the end of the list. 
        // The add method is used to add elements to the ArrayList.
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");
        displayCities(cityList); // Display the list of cities using the displayCities method
        // Note: You will need to write the displayCities method, which takes an ArrayList of 
        // Strings as a parameter and displays the cities in the list.

        // Print in the standard output the size of the list
        System.out.println();
        System.out.println("List size? " + cityList.size());
        // Use a method to check if Miami is in the list
        if (cityList.contains("Miami")) { // contains is a method that checks if the specified element is 
        // present in the list and returns true or false
            System.out.println("Miami is on the list!");
        } else {
            System.out.println("Miami is not on the list!");
        }

        // You could also do this to Find Miami:

            // System.out.println("List size? " + cityList.size());
            // This is because .contains is a boolean, meaning it determines true or false automatically.
            // System.out.println("Is Miami in the list? "+ cityList.contains("Miami"));

        System.out.println("The location of Denver in the list? " + (cityList.indexOf("Denver") + 1));
        // indexOf is a method that returns the index of the first occurrence of the specified element in the list, or -1 if the list 
        // does not contain the element. We add 1 to the result to get the position in a human-readable format (starting from 1 instead of 0).
        System.out.println("Is the list empty? " + cityList.isEmpty());
        System.out.println("");

        // Insert the city Xian at index 2
        cityList.add(2, "Xian"); // add is a method that inserts the specified element at the specified position in the list.
        // Remove Miami from the list, do not use the index to remove.
        cityList.remove("Miami"); // Removes Miami from the list. 
        // remove is a method that removes the first occurrence of the specified element from the list, if it is present.
        // Remove a city at index 1.
        cityList.remove(1);
        System.out.println("List of cities after adding Xian, removing Miami, and removing the city at index 1 (Denver):");
        displayCities(cityList); // Used the displayCities method to display the list of cities after the modifications
        // Made so you don't need to use the for loop every time you want to display the list of cities.

        System.out.println("");
        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? "+ cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + (cityList.indexOf("Denver") + 1));
        System.out.println("Is the list empty? " + cityList.isEmpty());
    }

    public static void displayDeck(ArrayList<Card> deck) { // This method takes an ArrayList of Card objects as a parameter and 
    // displays the cards in the deck
    // public static void means that this method can be called without creating an instance of the Main class, 
    // and it does not return any value (void). 
    
        for (int i = 0; i < deck.size(); i++) {
            Card c = deck.get(i);
            System.out.println(i + 1 + ": " + c);
        }

    // Another way to do it is using the enhanced for loop
    //        for (Card card : Deck) {
    //            System.out.println(card);
    //        }
    }

    public static void displayCities(ArrayList<String> city) { // This method takes an ArrayList of Strings as a 
    // parameter and displays the cities in the list
        for (int i = 0; i < city.size(); i++) {
            String t = city.get(i);
            System.out.println(i + 1 + ": " + t); // This prints the index (starting from 1) and the city name for each city in the list
            // city.get(i) retrieves the city at index i from the ArrayList and assigns it to the variable t, which is then printed.
        }
    }
}









