package controlStatements.looping.forDemos;

public class Demo24DivisionWithoutOperator {
    public static void main(String[] args) {
        int number1 = 17;
        int number2 = 3;
        int quotient = 0;
        for (; number1 >= number2; quotient++) {
            number1 = number1 - number2;
        }
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder " + number1);

    }
}
