package operator.bitwiseOperators;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("left shift <<");
        // result of left shift operator = operand 1 * 2 ^ operand 2
        System.out.println(4 << 1);// 4 * 2 ^1 = 8
        System.out.println(4 << 2);// 4 * 2 ^2 = 16
        System.out.println(4 << 3);// 4 * 2 ^3 = 32
        System.out.println(4 << 4);// 4 * 2 ^4 = 64

        System.out.println("right shift >>");
        // result of right shift operator = operand 1 / 2 ^ operand 2
        System.out.println(4 >> 1);// 4 / 2 ^1 = 2
        System.out.println(4 >> 2);// 4 / 2 ^2 = 1
        System.out.println(4 >> 3);// 4 / 2 ^3 = 0
        System.out.println(4 >> 4);// 4 / 2 ^4 = 0
    }
}
