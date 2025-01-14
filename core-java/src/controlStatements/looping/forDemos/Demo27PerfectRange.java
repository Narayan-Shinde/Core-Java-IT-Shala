package controlStatements.looping.forDemos;

public class Demo27PerfectRange {
    public static void main(String[] args) {
        for (int number = 1; number <= 10000; number++) {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;//sum = sum + i;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
