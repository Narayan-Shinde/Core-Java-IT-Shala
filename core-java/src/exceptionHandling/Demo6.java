package exceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("***");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");

        //output :
        //finally block
        // rest of the main wont be executed
    }

}
