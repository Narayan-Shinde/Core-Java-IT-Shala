package classComponents.methods;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("max of three numbers " + maxOfThreeNumber(10, 20, 30));
        System.out.println("min of three numbers " + minOfThreeNumber(10, 20, 30));
    }

    public static int maxOfThreeNumber(int number1, int number2, int number3) {
        return number1 > number2 && number1 > number3 ? number1 :
                number2 > number1 && number2 > number3 ? number2 : number3;
    }

    public static int minOfThreeNumber(int number1, int number2, int number3) {
        return number1 < number2 && number1 < number3 ? number1 :
                number2 < number1 && number2 < number3 ? number2 : number3;
    }
}