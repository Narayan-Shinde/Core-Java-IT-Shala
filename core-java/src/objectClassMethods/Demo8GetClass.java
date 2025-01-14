package objectClassMethods;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo8GetClass {
    public static void main(String[] args) {
        class Student {
            int a;
            int b;
            int c;
            void m1(){}
            static  void m2(){}
            Student(){}
        }
        Student student = new Student();
        Class reference = student.getClass();
        Method[] methods = reference.getMethods();
        for (Method method : methods){
            System.out.println(method.getName());
        }

        int[] array = {10,20,30};
        System.out.println(array.hashCode());
        //System.out.println(array[10].hashCode());
        System.out.println(student.getClass().getName());// class objectClassMethods.Demo8GetClass$1Student

    }
}
