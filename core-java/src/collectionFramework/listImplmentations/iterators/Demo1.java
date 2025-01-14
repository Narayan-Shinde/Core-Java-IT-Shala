package collectionFramework.listImplmentations.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10);
        list.add(11);
        list.add(90);
        list.add(10);

        //1. print all elements
        System.out.println("1. toString method of list");
        System.out.println(list.toString());

        //2. accessing the elements one  by one using for loop
        System.out.println("2. traditional for loop");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        //3. accessing the elements one  by one using enhanced for loop
        System.out.println("3. enhanced for loop");
        for (int temp : list) {
            System.out.println(temp);
        }

        //4. accessing the elements using java8 forEach method
        System.out.println("4. java 8 forEach method");
        Consumer<Integer> consumer = input -> System.out.println(input);
        Consumer<Integer> consumer1 = System.out::println;
        // list.forEach(consumer1);
        list.forEach(System.out::println);
    }
}
