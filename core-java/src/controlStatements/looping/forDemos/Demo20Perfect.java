package controlStatements.looping.forDemos;

public class Demo20Perfect {
    public static void main(String[] args) {
        //perfect number : sum of factors = given number
        int number = 10;
        int sumOfFactors = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(i);
                sumOfFactors = sumOfFactors + i;
            }
        }
        System.out.println(number==sumOfFactors?"perfect":"not perfect");

    }
}
