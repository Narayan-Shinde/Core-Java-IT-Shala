package collectionFramework.listImplmentations.sorting;

import collectionFramework.listImplmentations.customObjects.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3Comparable {
    public static void main(String[] args) {
        Student student1 = new Student(1, "kundan", "kundan@gmail.com", "12345", "Mumbai");
        Student student2 = new Student(20, "mahendra", "Mahendra@gmail.com", "56789", "Yewalewadi");
        Student student3 = new Student(3, "mahetab", "mahetab@gmail.com", "3245", "Bangalore");
        Student student4 = new Student(11, "arti", "arti@gmail.com", "67", "Udaypur");
        Student student5 = new Student(4, "pranay", "pranay@gmail.com", "98", "Amaravati");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("************** before sorting ****************************");
        studentList.forEach(System.out::println);

        Collections.sort(studentList);


        System.out.println("************** after sorting ****************************");
        studentList.forEach(System.out::println);
    }
}
