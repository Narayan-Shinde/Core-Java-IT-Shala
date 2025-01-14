package wrapperClasses;

public class Demo3 {
    public static void main(String[] args) {
        String binaryString = Integer.toBinaryString(127);
        System.out.println("binary " + binaryString);
        System.out.println("hexa " + Integer.toHexString(127));
        System.out.println("octal " + Integer.toOctalString(127));
    }
}
