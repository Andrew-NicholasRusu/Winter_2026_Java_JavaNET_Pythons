package org.example.Data_Connector_System;

/*
2. Abstract Class: BaseConnector (implements Connector)
 */
public abstract class BaseConnector implements Connector {
    // Attribute: protected String name
    protected String name; // Stores the identifier for the connection type

    // Constructor:
    public BaseConnector(String name) {
        this.name = name;
    } // Initializes the name attribute.

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method: validate()
    public void validate() { // concrete method
        System.out.println( "Validating configuration for: " + this.getName());
    }

    // Method: abstract method connect() throws Exception,
    // forces subclasses to implement specific connection logic.
    public abstract void connect() throws Exception;
}


