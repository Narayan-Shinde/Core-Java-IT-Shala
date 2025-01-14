package operator.incrementDecrement;

public class Demo5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(a++ - b++ - c++ - d++);//-8
        System.out.println(a + b + c + d);//2+3+4+5=14
    }
}
