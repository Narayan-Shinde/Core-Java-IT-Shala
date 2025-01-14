package java8Features;

public class Demo5 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        NumberProcessor square = number -> number * number;
        NumberProcessor cube = number -> number * number * number;

        System.out.println("Square of the given number = " + square.process(10));
        System.out.println("cube of the given number = " + cube.process(10));


    }
}
