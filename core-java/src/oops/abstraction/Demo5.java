package oops.abstraction;

public class Demo5 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();
        }
        class B extends A {
            void m1() {}
        }
    }
}
