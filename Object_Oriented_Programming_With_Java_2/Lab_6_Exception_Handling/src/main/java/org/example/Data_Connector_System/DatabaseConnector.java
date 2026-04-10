package org.example.Data_Connector_System;

import java.sql.SQLException;

/*
3. Concrete Class: DatabaseConnector, a subclass of BaseConnector
 */
public class DatabaseConnector extends BaseConnector {

    // Constructor: DatabaseConnector()
    public DatabaseConnector() {
        super("SQL_DB");
    }

    // Method: void connect(): throws SQLException,
    // Overrides to call validate() and throw a java.sql.SQLException.
    @Override
    public void connect() throws SQLException {
        this.validate(); // Calls the validation
        // throw java.sql.SQLException
        throw new SQLException("[DB ERROR]: Connection timeout: Database server unreachable.");

    }
}
