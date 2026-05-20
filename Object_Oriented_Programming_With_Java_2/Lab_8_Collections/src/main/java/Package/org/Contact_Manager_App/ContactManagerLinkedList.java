package Package.org.Contact_Manager_App;

// d) Define a class called ContactManagerLinkedList that extends ContactManager and
// implements Package.org.Contact_Manager_App.Printable.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class ContactManagerLinkedList extends ContactManager implements Printable {

    // It should have a field:
    // contactsList: which is a LinkedList that holds Contact objects.
    private LinkedList<Contact> contactsList;

    public ContactManagerLinkedList() {
        this.contactsList = new LinkedList<>();
    }

    public ContactManagerLinkedList(LinkedList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public LinkedList<Contact> getContactsList() {
        return contactsList;
    }

    @Override
    public void addContact(String id, String name, String mobile, String email) {
        contactsList.add(new Contact(name, mobile, email, id));
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
    public boolean removeContact(String id) {
        Iterator<Contact> it = contactsList.iterator();
        while (it.hasNext()) {
            Contact c = it.next();
            if (c.getId().equals(id)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAll() {
        System.out.println("LinkedList Content:");
        System.out.println("----------------------------------------------------------");
        Iterator<Contact> it = contactsList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------------------------------");
    }
}
