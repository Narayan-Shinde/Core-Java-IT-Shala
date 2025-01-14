package operator.arithmetic;

public class Demo2 {
    public static void main(String[] args) {
        //1. ArithmeticException
        System.out.println(10 / 0);//ArithmeticException / by zero

        //2. Infinity
        System.out.println(10.0 / 0);//Infinity

        //3. NaN
        System.out.println(10.0 % 0);//NaN
    }
}
