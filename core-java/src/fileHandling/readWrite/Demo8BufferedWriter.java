package fileHandling.readWrite;

import java.io.*;

public class Demo8BufferedWriter {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("we are writing using bufferedwriter");
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write operation successfully");
    }
}
