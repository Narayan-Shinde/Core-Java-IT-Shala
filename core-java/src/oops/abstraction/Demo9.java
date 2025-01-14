package oops.abstraction;

public class Demo9 {
    public static void main(String[] args) {
        interface I1 {
            // by default variables are public static final
            public static final int a = 100;
            int b = 200;// this is not an instance variable

            //void m1(){} // instance method not allowed

            // by default methods are abstract
            void m1();

            public abstract void m2();

            // static methods are allowed from java 8
            public static void m3() {
            }

            //default methods
            default void m4() {
            }

            // constructors are not allowed
            //I1(){}

            //instance blocks are not allowed
            //{}
            //static {}

            //inner classes are not allowed. by default nested classes are public static
            class B {
            }

            public static class C {
            }


        }
    }
}
