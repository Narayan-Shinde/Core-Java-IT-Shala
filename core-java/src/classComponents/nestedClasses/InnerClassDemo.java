package classComponents.nestedClasses;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("instance variable of outer : "+outer.a);
        outer.m1();

        //using outer reference created the inner class object
        Outer.Inner inner = outer.new Inner();

        System.out.println("Inner class instance variable "+inner.b);
        inner.m2();



    }
}
