package oops.accessSpecifier;

public class Student {
    private int id;
    private String name;
    private int age;

    private Student() {

    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.id);
        System.out.println(s.name);
        System.out.println(s.age);
    }
}
