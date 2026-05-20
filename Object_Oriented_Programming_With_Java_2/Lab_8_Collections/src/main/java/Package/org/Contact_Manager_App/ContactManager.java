package Package.org.Contact_Manager_App;

import java.util.Collection;

// c) Define an abstract class
public abstract class ContactManager implements Printable {  
    
    public abstract void addContact(String id, String name, String mobile, String email);
    public abstract void addContact(Contact contact);
    public abstract Contact getContactByEmail(String email);
    public abstract Collection<Contact> getContactsByAreaCode(String areaCode);
    public abstract boolean removeContact(String id);
}
