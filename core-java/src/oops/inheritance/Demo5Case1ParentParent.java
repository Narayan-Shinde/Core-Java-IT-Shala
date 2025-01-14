package oops.inheritance;

public class Demo5Case1ParentParent {
    public static void main(String[] args) {

        class Parent {
            int v1 = 100;

            void m1() {
                System.out.println("parent method");
            }
        }

        class Child extends Parent {
            int v2 = 200;

            void m2() {
                System.out.println("child method");
            }
        }

        Parent parent = new Parent();
        System.out.println(parent.v1);
        parent.m1();
        // parent class cannot access child class members
       /* System.out.println(parent.v2); //CTE
        parent.m2(); //CTE*/
    }
}
