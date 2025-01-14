package controlStatements.looping.whileDemos;

public class Demo8ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        int originalNumber = number;
        //1^3 =1
        //5 ^3 = 125
        //3 ^ 3 = 27
        // 1+ 125 + 27 = 153
        //sum of cube of digits = given number
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number/ 10;
        }
        System.out.println(sum == originalNumber?"armstrong":"not armstrong");
    }
}
