package controlStatements.looping.whileDemos;

public class Demo10Palindrome {
    public static void main(String[] args) {
        //palindrome [ given number = reverse number]
        int number = 123;
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if (originalNumber == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
