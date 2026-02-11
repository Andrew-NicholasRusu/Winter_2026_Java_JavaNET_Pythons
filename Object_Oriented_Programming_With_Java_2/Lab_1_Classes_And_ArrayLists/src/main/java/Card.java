public class Card {
    private String suit;
    private String rank;
    private int value;

    // Constructors
    public Card() {
        this.suit = ""; // 
        this.rank = "";
        this.value = 0;
    }

    public Card(String suit, String rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }

    public Card(String suit, String rank) { // value is determined by rank
        this.suit = suit; // Set the suit
        this.rank = rank; // Determine value based on rank
        if (this.rank.equals("Ace")) // Ace is low
            this.value = 1; 
        else if (this.rank.equals("Jack"))
            this.value = 1;
        else if (this.rank.equals("Queen"))
            this.value = 11;
        else if (this.rank.equals("King"))
            this.value = 13;
        else this.value = Integer.parseInt(this.rank);
    }

    // Accessor methods
    public String getSuit() { 
        return this.suit; // return the suit of the card
    }

    public String getRank() {
        return this.rank; // return the rank of the card
    }

    public int getValue() {
        return this.value;
    }

    // Mutator Methods
    public void setSuit(String suit) { // set the suit of the card
        this.suit = suit;
    }

    public void setRank(String rank) { // set the rank of the card
        this.rank = rank;
    }

    public void setValue(int value) { // set the value of the card
        this.value = value;
    }

    // toString() Method
    @Override // Override the default toString() method
    // What does @Override do?
    // It tells the compiler that we are overriding a method from the superclass (in this case, Object class)
    public String toString() {
        String result = "";
        result = this.rank + " of " + this.suit + " with value " + this.value; // Create a string representation of the card
        // this.rank refers to the rank of the card, 
        // this.suit refers to the suit of the card, 
        // and this.value refers to the value of the card.
        // They're all added because we want to display all the attributes of the card when we print it.
        return result;
    }

    // equals() Method
    public boolean equals(Card secondObject) { // How does boolean work?
        // A boolean is a data type that can only take two values: true or false.
        // equals is added to compare two Card objects. It takes another Card object as a parameter 
        // and compares it to the current object (this).

        // Compare this object with the second object.
        boolean result = true;
        if (this.suit.equals(secondObject.suit) && this.rank.equals(secondObject.rank) && this.value == secondObject.value) 
            // Compare the suit, rank, and value of the two cards. If all attributes are equal, then the cards are considered equal.
            result = true;
        else
            result = false;

        return result;
    }
}