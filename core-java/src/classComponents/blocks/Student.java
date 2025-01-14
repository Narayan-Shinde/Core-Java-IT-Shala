package classComponents.blocks;

public class Student {
    static {
        System.out.println("static block");
    }

    {
        System.out.println("instance block");
    }

    public Student() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        Student s = new Student();
    }
}
