package objectClassMethods;

public class Demo3EqualsMethod {
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

        System.out.println(student1 == student2);//false
        System.out.println(student2 == student3);//false
        System.out.println(student1 == student3);//true

        // == is comparison operator --> boolean [true, false]
        int a = 100;
        int b = 100;
        int c = 10;
        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(b == c);//false
    }
}
