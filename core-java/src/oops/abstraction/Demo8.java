package oops.abstraction;

public class Demo8 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m1();
        }
        abstract class B extends A {
            abstract void m2();
        }
        abstract class C extends B {
            abstract void m3();
        }
        class D extends C {
            @Override
            void m1() {
                System.out.println("m1 overridden in D");
            }

            @Override
            void m2() {
                System.out.println("m2 overridden in D");
            }

            @Override
            void m3() {
                System.out.println("m3 overridden in D");
            }
        }

        A a = new D();
        a.m1();
       /* a.m2();
        a.m3();*/

        B b = new D();
        b.m1();
        b.m2();
        //b.m3();

        C c = new D();
        c.m1();
        c.m2();
        c.m3();

        D d = new D();
        d.m1();
        d.m2();
        d.m3();

    }
}
