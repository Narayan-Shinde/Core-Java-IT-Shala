package operator.arithmetic;

public class Demo3 {
    public static void main(String[] args) {
        //expression evaluation will be from left to right
        // it will follow BODMAS
        System.out.println(10 + 20 / 2 - 10 % 3 - 2);//17
        System.out.println(10 + 20 / (2 - 10) % 3 - 2);//6
    }
}
