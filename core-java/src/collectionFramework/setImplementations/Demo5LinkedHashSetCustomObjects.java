package collectionFramework.setImplementations;

import java.util.LinkedHashSet;

public class Demo5LinkedHashSetCustomObjects {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Kundan", "kundan@gmail.com", "12345", "Pune");
        Student student2 = new Student(2, "Mahendra", "Mahendra@gmail.com", "12345", "Pune");
        Student student3 = new Student(3, "mahetab", "mahetab@gmail.com", "12345", "Pune");
        Student student4 = new Student(11, "arti", "arti@gmail.com", "12345", "Nagpur");
        Student student5 = new Student(4, "pranay", "pranay@gmail.com", "12345", "Amaravati");
        Student student6 = new Student(4, "pranay", "pranay@gmail.com", "12345", "Amaravati");

        LinkedHashSet<Student> hashSet = new LinkedHashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);
        hashSet.add(student6);

        hashSet.forEach(System.out::println);

    }
}
