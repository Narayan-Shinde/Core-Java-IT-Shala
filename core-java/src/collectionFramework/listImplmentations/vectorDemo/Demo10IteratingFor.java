package collectionFramework.listImplmentations.vectorDemo;

import java.util.ArrayList;
import java.util.Vector;
import java.util.function.Consumer;

public class Demo10IteratingFor {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(22);
        vector.add(63);
        System.out.println("1. printing all of elements in one go");
        System.out.println(vector);

        System.out.println("2. iterating elements using traditional for loop");
        for (int index = 0; index < vector.size(); index++) {
            System.out.println(vector.get(index));
        }

        System.out.println("3. iterating elements using enhanced for loop");
        for (int temp : vector) {
            System.out.println(temp);
        }

        System.out.println("iterating elements using java 8 forEach method");
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Consumer<Integer> consumer = System.out::println;
        vector.forEach(consumer);

    }
}
