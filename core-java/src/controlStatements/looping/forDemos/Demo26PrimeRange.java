package controlStatements.looping.forDemos;

public class Demo26PrimeRange {
    public static void main(String[] args) {
        //find all prime numbers in a range [1 to 1000]
        for (int number = 1; number <=1000 ; number++) {
            boolean isPrime = true;
            for (int i = 2; i <= number/2 ; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
