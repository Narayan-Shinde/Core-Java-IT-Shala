package java8Features;

public class Demo2SubclassesForAbstractClass {
    public static void main(String[] args) {

        abstract class Parent {
            abstract void m1();
        }

        //1. traditional way of creating subclass of an abstract class
        class Child extends Parent {
            @Override
            void m1() {
                System.out.println("child class method");
            }
        }
        Parent parent = new Child();
        parent.m1();

        //2. creating subclass using anonymous class for concrete class
        Parent anon = new Parent() {
            @Override
            void m1() {
                System.out.println("anonymous class method");
            }
        };
        anon.m1();

        // we cannot create subclass of an abstract class using lambda and method reference
    }
}
