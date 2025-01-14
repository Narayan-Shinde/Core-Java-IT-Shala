package fileHandling.fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo4DeleteFile {
    public static void main(String[] args) throws IOException {
        String path = "abc1.txt";
        File file = new File(path);
        boolean isFileDeleted = file.delete();
        System.out.println("File deleted " + isFileDeleted);
    }
}
