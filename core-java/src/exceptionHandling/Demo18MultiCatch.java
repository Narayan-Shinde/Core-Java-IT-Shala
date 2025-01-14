package exceptionHandling;

public class Demo18MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
            String str = "null";
            System.out.println(str.length());
            int[] array = {};
            System.out.println(array[0]);
        } catch (ArithmeticException
                 | NullPointerException
                 | ArrayIndexOutOfBoundsException exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println("invalid denominator");
            }
            if (exception instanceof NullPointerException) {
                System.out.println("null reference");
            }
            if (exception instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("invalid index");
            }

        }
    }
}
