package operator.conditionalOperator;

public class Demo5 {
    public static void main(String[] args) {
        //minimum of three numbers
        int number1 = 700;
        int number2 = 400;
        int number3 = 300;

        System.out.println(
                (number1 < number2 && number1 < number3)
                        ? (number1)
                        : (number2 < number1 && number2 < number3
                        ? number2
                        : number3)
        );
    }
}
