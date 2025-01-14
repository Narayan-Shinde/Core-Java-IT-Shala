package operator.assignment;

public class Demo1 {
    public static void main(String[] args) {
        int a = 20; //direct value
        int b = 20 * 20; // expression
        int c = b;//another variable
        int d = add(10, 20);

        System.out.println(a);//20
        System.out.println(b);//400
        System.out.println(c);//400
        System.out.println(d);//30
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }
}
