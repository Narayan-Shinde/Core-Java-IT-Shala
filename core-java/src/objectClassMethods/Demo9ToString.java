package objectClassMethods;

public class Demo9ToString {
    public static void main(String[] args) {
        Student student = new Student();
        //objectClassMethods.Student@5f184fc6
        System.out.println(Integer.toHexString(200));//C8
        System.out.println(student.hashCode());
        //5f184fc6
        System.out.println(Integer.toHexString(student.hashCode()));

        System.out.println(student.getClass().getName() + "@" + Integer.toHexString(student.hashCode()));
        System.out.println(student);
        System.out.println(student.toString());

        Demo9ToString x = new Demo9ToString();
        System.out.println(x);
        System.out.println(x.toString());
    }
}
