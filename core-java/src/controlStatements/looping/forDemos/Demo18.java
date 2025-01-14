package controlStatements.looping.forDemos;

public class Demo18 {
    public static void main(String[] args) {
        //factors of given number
        //perfect number
        //prime number
        //factorial
        //palindrome
        //armstrong
        //prime perfect
        int number = 100;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor " + i);
            }
        }
    }
}
