package fileHandling.readWrite;

import java.io.*;

public class Demo6BufferedReader {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int input = bufferedReader.read();
        while (input != -1) {
            System.out.print((char) input);
            input = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();
    }
}
