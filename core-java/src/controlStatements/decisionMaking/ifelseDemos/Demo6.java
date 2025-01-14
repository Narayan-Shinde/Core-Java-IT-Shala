package controlStatements.decisionMaking.ifelseDemos;

public class Demo6 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 199;
        if (number1 > number2) {
            System.out.println("maximum number is " + number1);
        } else {
            System.out.println("maximum number is " + number2);
        }

        System.out.println("conditional operator");
        System.out.println("maximum number is " + (number1 > number2 ? number1 : number2));
    }
}
