package controlStatements.looping.forDemos;

public class Demo22Factorial {
    public static void main(String[] args) {
        //factors of 6 = 1, 2, 3
        //factorial of 6 = 6 * 5 * 4 * 3 * 2 * 1 => 720
        // factorial of 5 = 1 * 2 * 3 * 4 * 5 = 120
        int number = 6;
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
//            factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("factorial of given number is  "+factorial);
    }
}
