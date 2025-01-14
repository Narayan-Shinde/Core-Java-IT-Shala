package oops.inheritance;

public class Demo7Case3ParentChild {
    public static void main(String[] args) {

        // Parent parent = new Child()
        //1. present only in parent -->  access it from parent class
        //2. present only in child ---> CTE
        //3. present in both parent and child --> variables from parent and methods from child

        class Parent {
            int a = 100;
            int x = 7878878;

            void m3() {
                System.out.println("m3 parent");
            }

            void m1() {
                System.out.println("parent m1");
            }
        }

        class Child extends Parent {
            int b = 200;

            void m2() {
                System.out.println("child m2");
            }

            int x = 100;

            void m3() {
                System.out.println("m3 child");
            }
        }

        Parent parent = new Child();

        System.out.println("1. members only present inside the paret class --> access it from parent class");
        System.out.println("variable present only inside the parent class " + parent.a);
        parent.m1();//method present only inside the parent class

        //2. members only present inside the child class ---> CTE
       /* System.out.println(parent.b);
        parent.m2();*/

        //3. same members are present inside both parent and child --> variables--> parent and methods --> child
        System.out.println(parent.x); //value from parent --> 10
        parent.m3(); //child class method

    }
}
