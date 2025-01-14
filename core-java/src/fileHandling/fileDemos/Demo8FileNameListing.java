package fileHandling.fileDemos;

import java.io.File;

public class Demo8FileNameListing {
    public static void main(String[] args) {
        //print the names of all files in the given folder
        String path = "C:\\Work\\ISJ010\\core-java\\src\\exceptionHandling";
        File folder = new File(path);

        String[] fileNamesFromGivenFolder = folder.list();

        //enhanced for loop
        for (String temp : fileNamesFromGivenFolder) {
            System.out.println(temp);
        }
    }
}
