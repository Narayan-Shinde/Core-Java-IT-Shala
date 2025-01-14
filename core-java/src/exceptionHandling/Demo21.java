package exceptionHandling;

public class Demo21 {
    public static void main(String[] args) {
        //implicitly object creation : ArithmeticException --> give the object to JRE
        //System.out.println(10/0);

        //explicitly
        throw new ArithmeticException("divide by zero");

        //System.out.println("rest of the main");
    }
}
