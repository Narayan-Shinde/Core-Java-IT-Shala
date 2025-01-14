package oops.inheritance;

public class Demo2 {
    public static void main(String[] args) {

        class Parent {
            Parent() {
                System.out.println("parent constructor");
            }
        }

        //Single Level Inheritance
        class Child extends Parent {
            Child(){
                //1. call to the constructor by default it will be super class constructor
                super();
                //2. instance block of the same class
                System.out.println("child zero param constructor");
            }
        }

        Child child = new Child();//child class  constructor


    }
}
