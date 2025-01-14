package oops.inheritance;

public class Demo8Case4ChildParent {
    public static void main(String[] args) {

        class Parent {

        }

        class Child extends Parent {

        }

        // case 4
        //Child child = new Parent();//CTE

        int a = 10;

        // child is a type of parent --> IS A
        Parent parent = new Child();



    }
}
