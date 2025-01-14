package operator.incrementDecrement;

public class Demo6 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(++a + b-- + c-- + d++ + a-- + ++b + c);
        //2 + 2 + 3 + 4 + 2 +  2 + 2 = 17

    }
}
