package objectClassMethods;

public class Demo2HashCodeMethod {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;
            Student(int id, String name){
                this.id = id;
                this.name = name;
            }
        }

        Student student1 = new Student(101,"kundan");
        Student student2 = new Student(101,"kundan");

        Student student3 = student1;

        System.out.println("s1 "+student1.hashCode());//1595428806
        System.out.println("s3 "+student3.hashCode());//1595428806
        System.out.println("s2 "+student2.hashCode());//2093176254
    }
}
