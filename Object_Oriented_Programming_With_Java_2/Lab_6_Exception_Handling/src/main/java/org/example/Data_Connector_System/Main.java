package org.example.Data_Connector_System;

/*
Task 2: The main class
 */

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    // Write a demonstration class with a main method:
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Create a DatabaseConnector and a CloudConnector object.
        DatabaseConnector dbConnector = new DatabaseConnector();
        CloudConnector cloudConnector = new CloudConnector();

        // Store these objects in an array called systems.
        BaseConnector[] systems = new BaseConnector[2]; // Polymorphism
        systems[0] = dbConnector;
        systems[1] = cloudConnector;

        // Write a try-catch block that tries to connect both systems and handle SQLException, IOException, and a general Exception.
        for (int i = 0; i < systems.length; i++) {
            System.out.println();
            try {
                systems[i].connect();
            } catch (IOException io) { // IOException
                System.out.println("IOException: " + io.getMessage());
            } catch (SQLException s) { // SQL Exception
                System.out.println("SQLException: " + s.getMessage());
            } catch (Exception e) { // General Exception
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
