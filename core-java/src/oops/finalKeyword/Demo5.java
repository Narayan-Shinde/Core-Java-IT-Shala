package oops.finalKeyword;

public class Demo5 {
    public static void main(String[] args) {
        class A {
            final void foo(){
                System.out.println("A foo");
            }
        }
        class B extends A {
            //CTE --> final method cannot be overridden
          /*  void foo(){
                System.out.println("B - foo");
            }*/
        }
    }
}
