package objectClassMethods;

import classComponents.variables.Product;

import java.util.Objects;

public class Demo5EqualsMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;
            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
            @Override
            public boolean equals(Object obj) {
                if (obj == null) {
                    return false;
                }
                if (!(obj instanceof Student)) {
                    return false;
                }
                //type casting
                Student student = (Student) obj;
                return this.id == student.id;
            }

            @Override
            public int hashCode() {
                return Objects.hashCode(this.id);
            }
        }

        Student student1 = new Student(101, "kundan");
        Student student2 = new Student(101, "kundan");

        //false by equals method of Object class
        System.out.println(student1.equals(student2));//true
        System.out.println(student1.equals(null));//null check --> false
        System.out.println(student1.equals(new Product())); // product type input --> false

        System.out.println("student 1 hashcode "+student1.hashCode()); //101
        System.out.println("student 2 hashcode "+student2.hashCode()); //101


    }
}
