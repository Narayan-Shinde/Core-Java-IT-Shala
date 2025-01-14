package classComponents.methods;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("is even : " + isEven(10));
        System.out.println("is even : " + Assignment2.isEven(11));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
