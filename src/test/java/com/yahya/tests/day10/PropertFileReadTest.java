package com.yahya.tests.day10;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertFileReadTest {

    @Test
    public void testInitialRead() throws IOException {

        // Open a connection to the file using FileInputStream object
        FileInputStream inputStream = new FileInputStream("config.properties");

        // Create empty properties object
        Properties properties = new Properties();
        // Load the fileinput stream into the properties object
        properties.load(inputStream);

        // close the connection
        inputStream.close();

        // now read from the properties file using key
        String helloValue = properties.getProperty("hello");
        System.out.println("helloValue = " + helloValue);

        System.out.println("properties.getProperty(\"message\") = " + properties.getProperty("message"));

        System.out.println("properties.getProperty(\"weborder_url\") = " + properties.getProperty("weborder_url"));
    }

    @Test
    public void testReadWithTryCatch(){

        try {
            FileInputStream inputStream = new FileInputStream("config.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            System.out.println("properties.get(\"hello\") = " + properties.get("hello"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
