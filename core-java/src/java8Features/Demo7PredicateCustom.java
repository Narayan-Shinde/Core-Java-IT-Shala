package java8Features;

public class Demo7PredicateCustom {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Predicate {
            boolean test(int number);
        }

        Predicate isEven = number -> number % 2 == 0;
        System.out.println("is even test " + isEven.test(10));//true
        System.out.println("is even test " + isEven.test(11));//false
    }
}
