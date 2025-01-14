package java8Features;

public class Demo1SubclassesForConcreteClass {
    public static void main(String[] args) {

        class Parent {
            void m1(){
                System.out.printf("parent method");
            }
        }

        //1. traditional way of creating subclass of a concrete class
        class Child extends Parent {
            @Override
            void m1() {
                System.out.printf("child class method");
            }
        }
        Parent parent = new Child();
        parent.m1();

        //2. creating subclass using anonymous class for concrete class
        Parent anon = new Parent(){
            @Override
            void m1() {
                System.out.printf("anonymous class method");
            }
        };
        anon.m1();

        // we cannot create subclass of a concrete class using lambda and method reference
    }
}
