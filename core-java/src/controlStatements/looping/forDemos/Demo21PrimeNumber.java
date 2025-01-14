package controlStatements.looping.forDemos;

public class Demo21PrimeNumber {
    public static void main(String[] args) {
        //prime number : don't have any factors apart from 1 and number itself
        //e.g. 13, 17, 7, 5,19, 11,23, 29
        int number = 17;
        boolean isPrime = true;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime?"its prime":"its not prime");

    }
}
