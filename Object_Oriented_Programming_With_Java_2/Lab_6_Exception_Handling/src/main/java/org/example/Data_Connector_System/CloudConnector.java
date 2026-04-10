package org.example.Data_Connector_System;

import java.io.IOException;

/*
4. Concrete Class: CloudConnector, a subclass BaseConnector
 */
public class CloudConnector extends BaseConnector {

    // Constructor: CloudConnector()
    public CloudConnector() {
        super("S3_BUCKET");
    }

    // Method: void connect() throws IOException, Overrides to call validate() and throw a java.io.IOException.
    @Override
    public void connect() throws IOException {
        this.validate();
        // throw java.sql.IOException
        throw new IOException("[NETWORK ERROR]: cloud server unreachable.");

    }
}
