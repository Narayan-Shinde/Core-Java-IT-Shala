package oops.inheritance;

public class Demo6Case2ChildChild {
    public static void main(String[] args) {

        class Parent {
          /*  int v1 = 100;

            void m1() {
                System.out.println("parent method");
            }*/

            int x = 100;
            void display(){
                System.out.println("parent display");
            }
        }

        class Child extends Parent {
            int v2 = 200;

            void m2() {
                System.out.println("child method");
            }
            int x = 200;
            void display(){
                System.out.println("child display");
            }
        }

        Child child = new Child();
        System.out.println(child.v2);
        child.m2();

        System.out.println(child.x);
        child.display();


    }
}
