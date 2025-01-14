package fileHandling.fileDemos;

import java.io.File;
import java.io.FilenameFilter;

public class Demo9FileNameListingAndFiltering {
    public static void main(String[] args) {
        //print the names of all files in the given folder
        String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling";
        File folder = new File(path);

        //anonymous class
        FilenameFilter fileNameFilter1 = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.length() > 10;
            }
        };

        //lambda expression
        FilenameFilter fileNameFilter2 = (dir, name) -> name.length() > 15;
        FilenameFilter fileNameFilter3 = (dir, name) -> name.startsWith("I");
        FilenameFilter fileNameFilter4 = (dir, name) -> name.contains("Demo1");
        String[] fileNamesFromGivenFolder = folder.list(fileNameFilter4);

        //enhanced for loop
        for (String temp : fileNamesFromGivenFolder) {
            System.out.println(temp);
        }
    }
}
