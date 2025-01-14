package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo20 {
    public static void main(String[] args)  {
        try {
            readFile("sC:\\Work\\ISJ010\\core-java\\src\\exceptionHandling\\Demo19Throws.java");
        } catch (IOException e) {
            System.out.println("Invalid path to the file");
        }
    }

    private static void readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int character = fileReader.read();
        System.out.println((char) character);

    }
}
