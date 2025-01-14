package multithreading.basics;

public class Demo1 {
    public static void main(String[] args) {
        //1. concrete class
        //abstract void display();//CTE


        //2. abstract class
        abstract class A{
            abstract void display();
        }

        //3. interfaces
        interface I {
            void display();
        }
    }

}
