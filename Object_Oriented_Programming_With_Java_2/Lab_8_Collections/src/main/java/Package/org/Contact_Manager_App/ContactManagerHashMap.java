package Package.org.Contact_Manager_App;

// f) Define a class called ContactManagerHashMap that extends ContactManager and
// implements Package.org.Contact_Manager_App.Printable

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactManagerHashMap extends ContactManager implements Printable {

    // Fields
    private HashMap<String, Contact> contactsList;

    // Constructors
    public ContactManagerHashMap() { // NO-ARG CONSTRUCTOR
        this.contactsList = new HashMap<>();
    }

    public ContactManagerHashMap(HashMap<String, Contact> contactsList) { // CONSTRUCTOR WITH ARGUMENTS
        this.contactsList = contactsList;
    }

    // Getters and Setters
    public HashMap<String, Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(HashMap<String, Contact> contactsList) {
        this.contactsList = contactsList;
    }

    @Override
    public void addContact(String id, String name, String mobile, String email) {
        Contact contact = new Contact(name, mobile, email, id);
        contactsList.put(id, contact);
}

    @Override
    public void addContact(Contact contact) {
        if (contact != null) {
            this.contactsList.put(contact.getId(), contact);
        }
    }

    @Override
    public Contact getContactByEmail(String email) {
        Iterator<Contact> iterator = this.contactsList.values().iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Collection<Contact> getContactsByAreaCode(String areaCode) {
        Collection<Contact> result = new ArrayList<>();
        Iterator<Contact> iterator = this.contactsList.values().iterator();
        while (iterator.hasNext()) {
            Contact c = iterator.next();
            if (c.getMobileNumber().startsWith(areaCode)) {
                result.add(c);
            }
        }
        return result;
    }

    @Override
    public boolean removeContact(String id) {
        return contactsList.remove(id) != null;
    }

    @Override
    public void printAll() {
        System.out.println("Hash Map Content:");
        System.out.println("----------------------------------------------------------");
        Iterator<Map.Entry<String, Contact>> it = contactsList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Contact> entry = it.next();
            // Match sample outputL Key = 020 Value = ' 020
            System.out.println("Key= " + entry.getKey() + " Value = " + entry.getValue().toString());
        }
        System.out.println("-----------------------------------------------------------");
    }
}
