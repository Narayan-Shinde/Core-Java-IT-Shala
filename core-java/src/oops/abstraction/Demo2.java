package oops.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        abstract class B {
            //non-static members
            int a;
            void m1(){}
            {}
            B(){}
            class A{}

            //static members
            static int b;
            static void m2(){}
            static {}
            static class C{}

            abstract void m3();
        }
    }
}
