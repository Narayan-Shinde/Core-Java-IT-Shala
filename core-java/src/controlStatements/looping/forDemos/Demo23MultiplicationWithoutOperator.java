package controlStatements.looping.forDemos;

public class Demo23MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;
        int sum = 0;
        for (int i = 1; i <= number2; i++) {
            sum += number1;
//            sum =  sum + number2;
        }
        System.out.println("Multiplication is "+sum);
    }
}
