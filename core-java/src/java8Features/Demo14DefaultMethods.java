package java8Features;

public class Demo14DefaultMethods {
    public static void main(String[] args) {
        interface A {
            void m1();

            void m2();

            default void m3(){
                System.out.println("default method from interface A");
            }
        }

        class P implements A {
            @Override
            public void m1() {
                System.out.println("P:m1");
            }

            @Override
            public void m2() {
                System.out.println("P:m2");
            }

            @Override
            public void m3() {
                A.super.m3();//call to the interface default method from child class
                System.out.println("P:m3 added logic");
            }
        }

        class Q implements A {
            @Override
            public void m1() {
                System.out.println("Q:m1");
            }

            @Override
            public void m2() {
                System.out.println("Q:m2");
            }
        }

        class R implements A {
            @Override
            public void m1() {
                System.out.println("R:m1");
            }

            @Override
            public void m2() {
                System.out.println("R:m2");
            }
        }

        A a =  new P();
        a.m1();
        a.m2();
        a.m3();

    }
}
