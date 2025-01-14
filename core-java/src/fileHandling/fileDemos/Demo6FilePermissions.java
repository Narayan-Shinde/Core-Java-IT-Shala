package fileHandling.fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo6FilePermissions {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";
        File file = new File(path);
        boolean isFileCreated = file.createNewFile();
        System.out.println("File created " + isFileCreated);
        file.setWritable(false);
        System.out.println("File set to read only");

        System.out.println("File permissions " + file.canWrite());

    }
}
