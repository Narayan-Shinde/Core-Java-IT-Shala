package collectionFramework.setImplementations;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo6TreeSetCustomObjects {
    public static void main(String[] args) {
        Student student1 = new Student(1, "kundan", "kundan@gmail.com", "12345", "Pune");
        Student student2 = new Student(2, "mahendra", "Mahendra@gmail.com", "12345", "Pune");
        Student student3 = new Student(3, "mahetab", "mahetab@gmail.com", "12345", "Pune");
        Student student4 = new Student(11, "arti", "arti@gmail.com", "12345", "Nagpur");
        Student student5 = new Student(4, "pranay", "pranay@gmail.com", "12345", "Amaravati");
        Student student6 = new Student(4, "pranay", "pranay@gmail.com", "12345", "Amaravati");

//        Comparator<Student> comparator = (s1, s2) -> s1.getId() - s2.getId();
//        Comparator<Student> comparator = (s1, s2) -> s1.getId() - s2.getId();

        Comparator<Student> comparator = (s1, s2) -> s1.getName().compareTo(s2.getName());

        TreeSet<Student> treeSet = new TreeSet<>(comparator);
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        treeSet.add(student6);

        treeSet.forEach(System.out::println);

    }
}
