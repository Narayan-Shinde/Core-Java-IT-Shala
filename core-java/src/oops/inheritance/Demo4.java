package oops.inheritance;

public class Demo4 {
    public static void main(String[] args) {

        class A {
        }
        class B {
        }

        //multiple inheritance  is not supported through classes
        //class C extends A, B{} //CTE

        //cyclic inheritance -->not supported in java through classes as well as interfaces
        //class C  extends C {} //CTE

    }
}
