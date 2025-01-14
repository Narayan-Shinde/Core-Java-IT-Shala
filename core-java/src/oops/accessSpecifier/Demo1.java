package oops.accessSpecifier;

public class Demo1 {
    static public int a = 1; //public
    static private int b = 2; //private
    static protected int c = 3; //protected
    static int d = 4; //default

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    class B extends Demo1 {
        public static void main(String[] args) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}
