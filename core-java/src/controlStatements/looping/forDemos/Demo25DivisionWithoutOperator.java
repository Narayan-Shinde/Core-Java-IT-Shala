package controlStatements.looping.forDemos;

public class Demo25DivisionWithoutOperator {
    public static void main(String[] args) {
        int number1 = 17;
        int number2 = 3;
        int quotient = 0;
        while (number1 >= number2) {
            number1 = number1 - number2;
            quotient++;
        }
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder " + number1);

    }
}
