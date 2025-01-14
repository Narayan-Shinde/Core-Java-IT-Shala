package fileHandling.readWrite;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write('z');
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Write operation successfully");
    }
}
