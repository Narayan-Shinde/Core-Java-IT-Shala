package fileHandling.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo1SerializeJavaObject {
    public static void main(String[] args) throws IOException {
        Student student = new Student(1, "admin", "admin");
        String path = "student-details.txt";
        File file = new File(path);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(student);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Student object saved");
    }
}
