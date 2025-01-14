package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("***");
        } catch (NullPointerException nullPointerException) {
            System.out.println("handles NPE");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");

        //output :
        //finally block
        // rest of the main won't be executed
    }

}
