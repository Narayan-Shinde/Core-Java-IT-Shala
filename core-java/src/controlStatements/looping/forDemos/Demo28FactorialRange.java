package controlStatements.looping.forDemos;

public class Demo28FactorialRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
        }
    }
}
