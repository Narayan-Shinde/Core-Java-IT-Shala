package classComponents.variables;

public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1 --> reference variable
        // new ---> keyword which is used to create an object
        // Student() ---> constructor call
        // new Student(); -----> object
        //Student ---> class name or derived data type
        System.out.println(s1);//hashcode/ reference/address

        //set new values
        s1.studentId = 101;
        s1.studentName = "John Doe";
        s1.studentAddress = "Swargate";
        s1.studentAge = 23;
        s1.studentGender = "male";
        s1.studentCourse = "Computer Science";

        //printing the values
        System.out.println("Student Id \t"+s1.studentId);
        System.out.println("Student Name \t"+s1.studentName);
        System.out.println("Student Address \t"+s1.studentAddress);
        System.out.println("Student Age \t"+s1.studentAge);
        System.out.println("Student Gender \t"+s1.studentGender);
        System.out.println("Student Course \t"+s1.studentCourse);

    }
}
