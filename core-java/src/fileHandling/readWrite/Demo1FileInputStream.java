package fileHandling.readWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo1FileInputStream {
    public static void main(String[] args) throws IOException {
        ///FileInputStream : read the bytes from a file
        String path = "abc.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        int input = fileInputStream.read();

        //read method returns -1 at the end of file
        while (input != -1) {
            System.out.print((char) input);
            input = fileInputStream.read();
        }

        fileInputStream.close();

    }
}
