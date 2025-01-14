package fileHandling.readWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4FileWriter {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        //by default append is false. content will be overridden
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("we can write strings using file writer.");
        fileWriter.close();
        System.out.println("Write operation completed");
    }
}
