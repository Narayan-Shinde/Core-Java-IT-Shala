package java8Features;

import java.util.function.Predicate;

public class Demo8PredicateCustom {
    public static void main(String[] args) {

       /* @FunctionalInterface
        interface Predicate<T> {
            boolean test(T input);
        }
*/
        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<String> stringTest = str->str.startsWith("A");

        System.out.println("is even test " + isEven.test(10));//true
        System.out.println(stringTest.test("Anil"));//true
        System.out.println(stringTest.test("Yash"));//false
    }
}
