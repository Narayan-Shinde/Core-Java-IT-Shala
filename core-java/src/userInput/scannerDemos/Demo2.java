package userInput.scannerDemos;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Enter the operation");
        String operation = scanner.next();

        switch (operation) {
            case "+" -> System.out.println("Addition is " + (number1 + number2));
            case "-" -> System.out.println("Subtraction is " + (number1 - number2));
            case "*" -> System.out.println("Multiplication is " + (number1 * number2));
            case "/" -> System.out.println("Division is " + (number1 / number2));
            case "%" -> System.out.println("Division -remainder is " + (number1 % number2));
            default -> System.out.println("invalid operation");
        }
    }
}
