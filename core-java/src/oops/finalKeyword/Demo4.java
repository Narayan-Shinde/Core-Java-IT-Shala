package oops.finalKeyword;

public class Demo4 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        final Student s1 = new Student(1, "abc");
        //s1 = new Student(100,"xyz");
        s1.id = 2;
        s1.name = "kartik";
        System.out.println(s1.id + " " + s1.name);
    }
}
