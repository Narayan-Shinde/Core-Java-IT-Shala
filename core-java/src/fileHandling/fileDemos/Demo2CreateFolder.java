package fileHandling.fileDemos;

import java.io.File;

public class Demo2CreateFolder {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ010\\temp-files";
        File folder = new File(path);
        boolean isFolderCreated = folder.mkdir();
        System.out.println("Folder created " + isFolderCreated);
    }
}
