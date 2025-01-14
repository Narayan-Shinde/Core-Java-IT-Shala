package controlStatements.looping.forDemos;

public class Demo19Factors {
    public static void main(String[] args) {
        int number = 6;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
