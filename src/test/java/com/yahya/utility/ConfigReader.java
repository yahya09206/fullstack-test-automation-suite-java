package com.yahya.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Declaring properties object at class level so it can be accessed in static method
    private static Properties properties = new Properties();

    // only need to load once so use a static block
    static {
        try {
            FileInputStream inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Get the value of key according to the key provided
     *
     */
    public static String read(String key){
        return properties.getProperty(key);
    }
}
