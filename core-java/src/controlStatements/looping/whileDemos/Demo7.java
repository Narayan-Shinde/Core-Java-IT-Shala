package controlStatements.looping.whileDemos;

public class Demo7 {
    public static void main(String[] args) {
        int number = 123456789;
        int sum = 0;
        //sum of digits of a given number
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum: " + sum);
    }
}
