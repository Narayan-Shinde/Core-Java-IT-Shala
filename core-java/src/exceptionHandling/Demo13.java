package exceptionHandling;

public class Demo13 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = "null";
            System.out.println(str.length());
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("invalid denominator");
        } catch (NullPointerException nullPointerException) {
            System.out.println("null operations");
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("invalid index");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");

        /*
        Output:
        1. 10
        2. 4
        3. invalid index
        4. finally block
        5. rest of the main

        * */
    }
}
