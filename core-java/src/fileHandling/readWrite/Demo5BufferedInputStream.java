package fileHandling.readWrite;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo5BufferedInputStream {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int input = bufferedInputStream.read();
        while (input != -1) {
            System.out.print((char) input);
            input = bufferedInputStream.read();
        }
        bufferedInputStream.close();
        fileInputStream.close();
    }
}
