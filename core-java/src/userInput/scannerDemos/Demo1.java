package userInput.scannerDemos;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //input from the user -->
        //input devices --> keyboard, mouse, scanner, camera
        // data --> text, images, video, audio, ...
        //Scanner ---> text ---> byte, short, int, long, float, double, char, boolean, String,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a byte value");
        byte byteValue =  scanner.nextByte();

        System.out.println("Enter a short value");
        short shortValue =  scanner.nextShort();

        System.out.println("Enter a int value");
        int intValue =  scanner.nextInt();

        System.out.println("Enter a long value");
        long longValue =  scanner.nextLong();

        System.out.println("Enter a float value");
        float floatValue =  scanner.nextFloat();

        System.out.println("Enter a double value");
        double doubleValue =  scanner.nextDouble();

        System.out.println("Enter a boolean value");
        boolean booleanValue =  scanner.nextBoolean();

        System.out.println("Enter a String value");
        String stringValue =  scanner.next();

        System.out.println("Enter a char value");
        char charValue =  stringValue.charAt(0);

        System.out.println("printing all accepted values");
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(booleanValue);
        System.out.println(stringValue);
        System.out.println(charValue);
    }
}
