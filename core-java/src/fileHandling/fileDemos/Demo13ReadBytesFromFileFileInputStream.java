package fileHandling.fileDemos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo13ReadBytesFromFileFileInputStream {
    public static void main(String[] args) throws IOException {
        //read content
        String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling\\Demo1.java";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        //end of file read method returns -1
        int input = fileInputStream.read();
        while (input != -1) {
            System.out.print((char) input);
            input = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
