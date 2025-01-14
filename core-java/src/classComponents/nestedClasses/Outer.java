package classComponents.nestedClasses;

public class Outer {
    int a = 10;

    void m1() {
        System.out.println("Outer class m1 method");
    }

    class Inner {
        int b = 100;

        void m2() {
            System.out.println("Inner class m2 method");
        }
    }
}
