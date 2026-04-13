package Package.org.Contact_Manager_App;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // --- PROBLEM 1: LinkedList ---
        String fileName = "src/contacts.csv";
        System.out.println("Contact Manager App\n");
        System.out.println("Problem 1: Using a Linked List with name as a key");
        System.out.println("LinkedList Content:");
        System.out.println("--------------------------------------");
        ContactManager contactManagerList = new ContactManagerLinkedList();
        loadContactsFromFile(fileName, contactManagerList);
        contactManagerList.printAll();
        System.out.println("--------------------------------------");

        // --- PROBLEM 2: HashMap ---
        System.out.println("Problem 2: using a HashMap with name as a key:");
        System.out.println("HashMap Content:");
        System.out.println("--------------------------------------");
        ContactManager contactManagerMap = new ContactManagerHashMap();
        loadContactsFromFile(fileName, contactManagerMap);
        contactManagerMap.printAll();
        System.out.println("--------------------------------------\n");

        // --- PROBLEM 3: TreeMap ---
        System.out.println("Problem 3: Using a TreeMap with name as a key");
        System.out.println("TreeMap Content:");
        System.out.println("--------------------------------------");
        ContactManager contactManagerTree = new ContactManagerTreeMap();
        loadContactsFromFile(fileName, contactManagerTree);
        contactManagerTree.printAll();
        System.out.println("--------------------------------------\n");
    }

    public static int loadContactsFromFile(String fileName, ContactManager contactManager) {
        // open the file with name filename
        // read the contacts data line by line and store them in the contactManager object
        int result = 0;
        try (Scanner myScanner = new Scanner(new File(fileName))) {// Read the header line and ignore it (if the file isn't empty)
            if (myScanner.hasNextLine()) {
                myScanner.nextLine();
            }

            while (myScanner.hasNext()) {
                String line = myScanner.nextLine();
                // System.out.println(line); // used to debug the code
                String[] parts = line.split(","); // splits the line by commas in separate strings
                // id, Last, First, Work number, Mobile number, Home number, email
                // Safety check: ensure there are enough columns before accessing index 6
                if (parts.length >= 7) {
                    // id, Last, First, Work number, Mobile number, Home number, email
                    String id = parts[0].trim();
                    String name = parts[2].trim() + " " + parts[1].trim();
                    String mobileNumber = parts[4].trim();
                    String email = parts[6].trim();
                    contactManager.addContact(id, name, mobileNumber, email);
                    result++; // Count the successfully added contacts
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Sorry! File " + fileName + " not found: " + e.getMessage() );
            result = -1;
        }
        return result;

    }
}