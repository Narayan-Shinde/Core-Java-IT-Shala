package oops.accessSpecifier.p1;

import oops.accessSpecifier.Demo1;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(Demo1.a);//public --> same class, same package, different package
        // System.out.println(Demo1.b); //private ---> same class --> CTE
        //System.out.println(Demo1.c); //protected --> same class, same package, child class
        //System.out.println(Demo1.d); //default --> same class, same package
    }
}
