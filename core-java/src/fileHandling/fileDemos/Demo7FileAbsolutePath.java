package fileHandling.fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo7FileAbsolutePath {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        System.out.println("File path absolute " + file.getAbsolutePath());
        System.out.println("File path relative " + file.getPath());
    }
}
