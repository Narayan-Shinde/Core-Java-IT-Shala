package com.itshaala;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Hello world!
 */
public class ReadingUsingFileInputStream {
    public static void main(String[] args) throws IOException {
       //read the application.properties file
        File file = new File("C:\\Work\\ISJ010\\spring\\reading-properties-file\\src\\main\\resources\\application.properties");
        FileInputStream fis = new FileInputStream(file);
        int read = fis.read();
        while (read != -1) {
            System.out.print((char) read);
            read = fis.read();
        }
        fis.close();
    }
}
