package fileHandling.fileDemos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo14ReadBytesFromFileFileReader {
    public static void main(String[] args) throws IOException {
        //read content
        String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling\\Demo1.java";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        //end of file read method returns -1
        int input = fileReader.read();
        while (input != -1) {
            System.out.print((char) input);
            input = fileReader.read();
        }
        fileReader.close();
    }
}
