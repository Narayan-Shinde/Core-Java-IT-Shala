package oops.polymorphism.methodOverloading;

public class Demo3 {

    //constructor overloading
    Demo3() {
    }

    Demo3(int a) {

    }

    final void display(int a) {
        System.out.println("Display Method final");
    }

    private void m1() {
    }

    private void m1(int a) {
    }

    void display(int a, int b) {
        System.out.println("Display Method final overloaded");
    }

    public static void main(String[] args) {
        main();
    }

    //we can overload main method
    // we can overload static methods
    //we can overload private methods
    //we can overload final method
    //we can overload constructors also
    public static void main() {
        System.out.println("overloaded main method");
    }

}
