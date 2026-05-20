package Package.org.Contact_Manager_App;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String fileName = "contacts.csv";
        System.out.println("Contact Manager App\n");
        
        // Problem 1: LinkedList
        System.out.println("Problem 1: Using a Linked List with name as a key");
        System.out.println("LinkedList Content:");
        System.out.println("--------------------------------------");
        ContactManager contactManagerList = new ContactManagerLinkedList();
        loadContactsFromFile(fileName, contactManagerList);
        contactManagerList.printAll();
        System.out.println("--------------------------------------");

        // Problem 2: HashMap
        System.out.println("Problem 2: using a HashMap with name as a key:");
        System.out.println("HashMap Content:");
        System.out.println("--------------------------------------");
        ContactManager contactManagerMap = new ContactManagerHashMap();
        loadContactsFromFile(fileName, contactManagerMap);
        contactManagerMap.printAll();
        System.out.println("--------------------------------------\n");

        // Problem 3: TreeMap
        System.out.println("Problem 3: Using a TreeMap with name as a key");
        System.out.println("TreeMap Content:");
        System.out.println("--------------------------------------");
        ContactManager contactManagerTree = new ContactManagerTreeMap();
        loadContactsFromFile(fileName, contactManagerTree);
        contactManagerTree.printAll();
        System.out.println("--------------------------------------\n");
    }

    public static int loadContactsFromFile(String fileName, ContactManager contactManager) {
        int result = 0;
        
        // Try loading from classpath
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream(fileName);
        
        if (inputStream == null) {
            System.out.println("Sorry! File " + fileName + " not found");
            return -1;
        }
        
        try (Scanner myScanner = new Scanner(inputStream)) {
            if (myScanner.hasNextLine()) {
                myScanner.nextLine(); // Skip header
            }

            while (myScanner.hasNextLine()) {
                String line = myScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 7) {
                    String id = parts[0].trim();
                    String name = parts[2].trim() + " " + parts[1].trim();
                    String mobileNumber = parts[4].trim();
                    String email = parts[6].trim();
                    contactManager.addContact(id, name, mobileNumber, email);
                    result++;
                }
            }
        } catch (Exception e) {
            System.out.println("Sorry! Error reading file " + fileName + ": " + e.getMessage());
            return -1;
        }
        return result;
    }
}
