package fileHandling.fileDemos;

import java.io.File;
import java.io.IOException;

public class Demo5DeleteFolder {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Work\\ISJ010\\temp-files";
        File folder = new File(path);
        boolean isFolderDeleted = folder.delete();
        System.out.println("Folder deleted " + isFolderDeleted);
    }
}
