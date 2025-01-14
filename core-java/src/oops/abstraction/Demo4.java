package oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        abstract class B {
            int x = 100;
            void m1(){
                System.out.println("abstract class instance method");
            }
            B() {
                System.out.println("B class constructor");
            }
        }

        class C extends B {

        }
        //abstract class and interface object cannot be created.
        // B b = new B();

        C c = new C();
        c.m1();
        System.out.println(c.x);
    }
}
