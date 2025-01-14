package objectClassMethods;

import java.util.Objects;

public class Demo4EqualsMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

        }

        Student student1 = new Student(101, "kundan");
        Student student2 = new Student(101, "kundan");
        Student student3 = student1;

        System.out.println("using == operator");
        System.out.println(student1 == student2);//false
        System.out.println(student2 == student3);//false
        System.out.println(student1 == student3);//true

        System.out.println("using equals method");
        System.out.println(student1.equals(student2));//false
        System.out.println(student2.equals(student3));//false
        System.out.println(student1.equals(student3));//true


    }
}
