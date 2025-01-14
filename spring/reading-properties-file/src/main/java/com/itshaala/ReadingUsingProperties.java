package com.itshaala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 */
public class ReadingUsingProperties {
    public static void main(String[] args) throws IOException {
        //read the application.properties file
        File file = new File("C:\\Work\\ISJ010\\spring\\reading-properties-file\\src\\main\\resources\\application.properties");
        FileInputStream fis = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fis);
        fis.close();
        System.out.println(prop);
        System.out.println("URL: " + prop.getProperty("url"));
        System.out.println("Username: " + prop.getProperty("username"));
        System.out.println("Password: " + prop.getProperty("password"));
        System.out.println("DriverClass: " + prop.getProperty("driver-class"));

    }
}
