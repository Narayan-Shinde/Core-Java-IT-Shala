package fileHandling.readWrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3FileOutputStream {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        //by default append is false. content will be overridden
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        fileOutputStream.write('A');
        fileOutputStream.close();
        System.out.println("Write operation completed");
    }
}
