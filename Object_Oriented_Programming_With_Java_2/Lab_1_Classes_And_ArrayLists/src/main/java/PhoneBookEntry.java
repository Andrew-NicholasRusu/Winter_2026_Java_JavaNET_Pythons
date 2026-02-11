public class PhoneBookEntry {
    private String name;
    private String phonenumber;

    // Constructor
    public PhoneBookEntry(String name, String phonenumber) { // Constructor that initializes the name and phone number
        this.name = name; // Set the name
        this.phonenumber = phonenumber; // Set the phone number
    }

    // Accessors
    public String getName(){ // Get the name
        return this.name; // return the name of the entry
    }

    public String getPhonenumber() { // Get the phone number

        // Remember: Accessor methods always have a return type that matches the type of the attribute they are accessing
        // Accessor methods do not take parameters because they simply return the value of the attribute
        // String is the return type because phonenumber is a String

        return this.phonenumber; // return the phone number of the entry
    }

    // Mutators
    public void setName(String name) { // Set the name

        // Mutators always have void return type because they do not return a value, they simply modify the object's state
        // String name is the parameter that will be used to set the name of the PhoneBookEntry object
        // Remember to put the parameter in the parentheses of the method definition, 
        // and to use the parameter to set the attribute of the object (this.name = name)

        this.name = name; // Set the name of the entry
    }

    public void setPhonenumber(String phonenumber) { // Set the phone number
        this.phonenumber = phonenumber;
    }

}
