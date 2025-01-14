package fileHandling.readWrite;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9FileOutputStreamVsBufferedOutputStream {
    public static void main(String[] args) throws IOException {
        // writeUsingFileOutputStream();
        writeUsingBufferedOutputStream();
    }

    private static void writeUsingFileOutputStream() throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            fileOutputStream.write(i);
        }
        long endTime = System.currentTimeMillis();
        fileOutputStream.close();
        System.out.println("Write operation complete.");
        System.out.println("Time taken to complete the operation " + (endTime - startTime));
    }

    private static void writeUsingBufferedOutputStream() throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            bufferedOutputStream.write(i);
        }
        long endTime = System.currentTimeMillis();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("Write operation complete.");
        System.out.println("Time taken to complete the operation " + (endTime - startTime));

    }
}
