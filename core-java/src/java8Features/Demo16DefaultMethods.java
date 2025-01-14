package java8Features;

public class Demo16DefaultMethods {
    public static void main(String[] args) {
        interface A {
            default void m1() {
                System.out.println("A:m1");
            }
        }

        interface B {
            default void m1() {
                System.out.println("B:m1");
            }
        }

        class C implements A, B {
        // to resolve the ambiguity , we have to override the method in child

            @Override
            public void m1() {
                A.super.m1();
                B.super.m1();
                System.out.println("C class : m1 method");
            }
        }

        C c = new C();
        c.m1();

    }
}
