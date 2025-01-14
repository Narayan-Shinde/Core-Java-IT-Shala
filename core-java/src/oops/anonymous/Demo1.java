package oops.anonymous;

public class Demo1 {
    public static void main(String[] args) {
        class A {
            void m1(){}
        }

        A a = new A() {
            void m1() {
                System.out.println("anonymous class m1 method");
            }
        };
        a.m1();
    }
}
