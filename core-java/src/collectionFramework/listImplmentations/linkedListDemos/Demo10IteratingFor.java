package collectionFramework.listImplmentations.linkedListDemos;

import java.util.LinkedList;
import java.util.function.Consumer;

public class Demo10IteratingFor {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(22);
        linkedList.add(63);
        System.out.println("1. printing all of elements in one go");
        System.out.println(linkedList);

        System.out.println("2. iterating elements using traditional for loop");
        for (int index = 0; index < linkedList.size(); index++) {
            System.out.println(linkedList.get(index));
        }

        System.out.println("3. iterating elements using enhanced for loop");
        for (int temp : linkedList) {
            System.out.println(temp);
        }

        System.out.println("iterating elements using java 8 forEach method");
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Consumer<Integer> consumer = System.out::println;
        linkedList.forEach(consumer);

    }
}
