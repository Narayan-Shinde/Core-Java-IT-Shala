package fileHandling.serialization;

import java.io.*;

public class Demo2DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "student-details.txt";
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
        objectInputStream.close();
        fileInputStream.close();

    }
}
