package fileHandling.fileDemos;

import java.io.File;
import java.io.FilenameFilter;

public class Demo11FileListingWithFileNameFilter {
    public static void main(String[] args) {
        String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling";
        File folder = new File(path);
        FilenameFilter filenameFilter1 = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("Demo2");
            }
        };
        FilenameFilter filenameFilter2 = (dir, name) -> name.startsWith("Demo2");

        File[] fileObjectArray = folder.listFiles(filenameFilter2);
        for (File file : fileObjectArray) {
            System.out.println(file.getName() + "\t" + file.length() + "\t" + file.getAbsolutePath());
        }


    }
}
