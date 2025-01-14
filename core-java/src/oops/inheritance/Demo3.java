package oops.inheritance;

public class Demo3 {
    public static void main(String[] args) {

        //multilevel inheritance
        class A {
            static {
                System.out.println("A static block");
            }

            {
                System.out.println("A instance block");
            }

            A() {
                super();
                //instance block
                System.out.println("A constructor");
            }
        }
        class B extends A {
            static {
                System.out.println("B static block");
            }

            {
                System.out.println("B instance block");
            }

            B() {
                //1. constructor call --> super class
                super();
                //2. instance block of same class
                System.out.println("B constructor");
            }
        }
        class C extends B {
            static {
                System.out.println("C static block");
            }

            {
                System.out.println("C instance block");
            }

            C() {
                super();
                //instance block
                System.out.println("C constructor");
            }
        }

        //A a = new A();
        //output
        // A class static block
        //A class instance block
        // A class constructor

        //B b = new B();
        //Output:
        // A static block
        // B static block
        // A instance block
        // A Constructor
        // B instance block
        // B constructor

        C c = new C();
        //output:
        // A class - static block
        // B class - static block
        // C class - static block
        // A class  - instance block
        // A class  - constructor
        // B class  - instance block
        // B class  - constructor
        // C class  - instance block
        // C class  - constructor

    }
}
