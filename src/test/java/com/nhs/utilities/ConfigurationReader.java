package com.nhs.utilities;

import java.io.FileInputStream;
import java.util.Properties;


//This class read and get data from configuration properties
public class ConfigurationReader {


    private static Properties properties;

    static {

        try {
            String path = "configuration.properties";

            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);

            fileInputStream.close();


        } catch (Exception e) {

            e.printStackTrace();


        }


    }

    //This method help us hold the value from configuration properties .
    public static String get(String keyName) {

        return properties.getProperty(keyName);


    }
}
