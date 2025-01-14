package operator.assignment;

public class Demo3 {
    public static void main(String[] args) {
        int number = 123;

        int digit = number % 10;
        System.out.println(digit);//3
        number = number / 10;

        digit = number % 10;
        System.out.println(digit);//2
        number = number / 10;

        digit = number % 10;
        System.out.println(digit);//1
        number = number / 10;
    }
}
