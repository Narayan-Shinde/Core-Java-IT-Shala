package fileHandling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Demo2FileReader {
    public static void main(String[] args) throws IOException {
        ///FileReader : read the bytes from a file
        String path = "abc.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int input = fileReader.read();

        //read method returns -1 at the end of file
        while (input != -1) {
            System.out.print((char) input);
            input = fileReader.read();
        }

        fileReader.close();

    }
}
