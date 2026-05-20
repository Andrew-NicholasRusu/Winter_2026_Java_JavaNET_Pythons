package Package.org.Contact_Manager_App;

// b) Create a Contact class that implements Comparable has:
    // id:String
    // name:String
    // mobileNumber: String
    // email: String

import java.util.Objects;

public class Contact implements Comparable<Contact>{ // The class should also implement Comparable Interface.
    // Two contacts are compared based on their name field.

    // Fields
    private String name;
    private String mobileNumber;
    private String email;
    private String id;

    // Constructors
    public Contact() { // NO-ARG CONSTRUCTOR
        this.name = "";
        this.mobileNumber = "";
        this.email = "";
        this.id = "";
    }

    public Contact(String name, String mobileNumber, String email, String id) { // CONSTRUCTOR WITH ARGUMENTS
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.id = id;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    // This will return 0 if the names are equal.
    // 1 if this.name > o.name and -1 if this.name < o.name.
    @Override
    public int compareTo(Contact o) {
        if (this.name == null && o.name == null) {
            return 0;
        }
        if (this.name == null) {
            return -1;
        }
        if (o.name == null) {
            return 1;
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals (Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Contact contact = (Contact) o;
        if (Objects.equals(id, contact.id) &&
                Objects.equals(name, contact.name) &&
                Objects.equals(mobileNumber, contact.mobileNumber) &&
                Objects.equals(email, contact.email))
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-25s %-15s %s", id, name, mobileNumber, email);
    }
}
