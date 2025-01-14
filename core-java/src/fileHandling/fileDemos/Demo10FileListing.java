package fileHandling.fileDemos;

import java.io.File;

public class Demo10FileListing {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling";
        File folder = new File(path);
        File[] fileObjectArray = folder.listFiles();
        for (File file : fileObjectArray) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }


    }
}
