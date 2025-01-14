package exceptionHandling;

public class Demo17 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } finally {
                System.out.println("finally block");
            }
            System.out.println("try");
        } catch (ArithmeticException ae) {
            System.out.println("catch block");
        }
        System.out.println("rest of the main");
        /*
        output:
        1. finally
        2. catch block
        3. rest of the main
        * */
    }
}
