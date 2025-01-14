package oops.abstraction;

public class Demo12 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Predicate {
            boolean test(int number);
        }

        class EvenOddTest implements Predicate {
            @Override
            public boolean test(int number) {
                return number % 2 == 0;
            }
        }

        Predicate predicate = new EvenOddTest();
        System.out.println("Is number even " + predicate.test(2));//true
        System.out.println("Is number even " + predicate.test(3));//false

        Predicate isMultipleOf5 = number -> number % 5 == 0;
        System.out.println("Is number multiple of 5 " + isMultipleOf5.test(2));
        System.out.println("Is number multiple of 5 " + isMultipleOf5.test(20));

    }
}
