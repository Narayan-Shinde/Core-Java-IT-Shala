package oops.abstraction;

public class Demo7 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();
        }
         class B extends A {
             @Override
             void m1() {
                 System.out.println("m1 overridden");
             }
         }
         A b = new B();
        b.m1();
    }
}
