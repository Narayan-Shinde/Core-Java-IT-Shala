package collectionFramework.listImplmentations.customObjects;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Kundan", "kundan@gmail.com", "12345", "Pune");
        Student student2 = new Student(2, "Mahendra", "Mahendra@gmail.com", "12345", "Pune");
        Student student3 = new Student(3, "mahetab", "mahetab@gmail.com", "12345", "Pune");
        Student student4 = new Student(11, "arti", "arti@gmail.com", "12345", "Nagpur");
        Student student5 = new Student(4, "pranay", "pranay@gmail.com", "12345", "Amaravati");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        studentList.forEach(System.out::println);
    }
}
