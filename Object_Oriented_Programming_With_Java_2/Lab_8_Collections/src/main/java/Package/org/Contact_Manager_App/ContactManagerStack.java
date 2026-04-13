package Package.org.Contact_Manager_App;

// e) Define a class called ContactManagerStack that extends ContactManager and implements
// Printable.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class ContactManagerStack extends ContactManager implements Printable {
    private Stack<Contact> contactsList;

    @Override
    public void addContact(String id, String name, String mobile, String email) {
        contactsList.add(new Contact(id, name, mobile, email));
    }

    @Override
    public void addContact(Contact contact) {
        contactsList.add(contact);
    }

    @Override
    public Contact getContactByEmail(String email) {
        Iterator <Contact> it = contactsList.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Collection<Contact> getContactsByAreaCode(String areaCode) {
        Collection<Contact> result = new ArrayList<>();
        Iterator<Contact> it = contactsList.iterator();

        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getMobileNumber().startsWith(areaCode)) {
                result.add(c);
            }
        }
        return result;
    }

    @Override
    public void printAll() {
        System.out.println("Stack Content:");
        System.out.println("----------------------------------------------------------");
        Iterator<Contact> it = contactsList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------------------------------");

    }
}
