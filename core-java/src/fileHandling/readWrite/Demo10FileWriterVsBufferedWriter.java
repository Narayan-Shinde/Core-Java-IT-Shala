package fileHandling.readWrite;

import java.io.*;

public class Demo10FileWriterVsBufferedWriter {
    public static void main(String[] args) throws IOException {
        //writeUsingFileWriter();
        writeUsingBufferedWriter();
    }

    private static void writeUsingFileWriter() throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            fileWriter.write(i);
        }
        long endTime = System.currentTimeMillis();
        fileWriter.close();
        System.out.println("Write operation complete.");
        System.out.println("Time taken to complete the operation " + (endTime - startTime));
    }

    private static void writeUsingBufferedWriter() throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            bufferedWriter.write(i);
        }
        long endTime = System.currentTimeMillis();
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write operation complete.");
        System.out.println("Time taken to complete the operation " + (endTime - startTime));

    }
}
