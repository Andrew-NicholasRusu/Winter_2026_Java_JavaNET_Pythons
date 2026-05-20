package Package.org.Contact_Manager_App;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ContactManagerTreeMap extends ContactManager implements Printable {

    private TreeMap<String, Contact> contactsList;
    public ContactManagerTreeMap() {
        this.contactsList = new TreeMap<>();
    }

    public ContactManagerTreeMap(TreeMap<String, Contact> contactsList) {
        this.contactsList = contactsList;
    }

    public TreeMap<String, Contact> getContactsList() {
        return contactsList;
    }

    public void setContactsList(TreeMap<String, Contact> contactsList) {
        this.contactsList = contactsList;
    }

    @Override
    public void addContact(String id, String name, String mobile, String email) {
        contactsList.put(id, new Contact(name, mobile, email, id));
    }

    @Override
    public void addContact(Contact contact) {
        if (contact != null) {
            contactsList.put(contact.getId(), contact);
        }
    }

    @Override
    public Contact getContactByEmail(String email) {
        Iterator<Contact> it = contactsList.values().iterator();
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
        Iterator<Contact> it = contactsList.values().iterator();
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
        return contactsList.remove(id) != null;
    }

    @Override
    public void printAll() {
        System.out.println("TreeMap Content:");
        System.out.println("---------------------------------------------------------");
        Iterator<Map.Entry<String, Contact>> it = contactsList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Contact> entry = it.next();
            // Match sample output: Key= 001 Value= 001
            // Alejandro Bernal Alonso     5143065939      a.bernalalonso@gmail.com
            System.out.println("Key= " + entry.getKey() + " Value= " + entry.getValue().toString());
        }
        System.out.println("---------------------------------------------------------");
    }
}
