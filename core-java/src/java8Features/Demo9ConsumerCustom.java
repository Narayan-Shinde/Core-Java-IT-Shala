package java8Features;

import java.util.function.Consumer;

public class Demo9ConsumerCustom {
    public static void main(String[] args) {

      /*  @FunctionalInterface
        interface Consumer<T> {
            void accept(T t);
        }
        */
        Consumer<String> stringConsumer = t -> System.out.println("you have entered " + t);
        Consumer<Integer> integerConsumer = t -> System.out.println("you have entered " + t);
        stringConsumer.accept("good morning");
        integerConsumer.accept(100);

    }
}
