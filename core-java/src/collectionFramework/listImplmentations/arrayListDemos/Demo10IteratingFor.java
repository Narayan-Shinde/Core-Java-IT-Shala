package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Demo10IteratingFor {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(22);
        arrayList.add(63);
        System.out.println("1. printing all of elements in one go");
        System.out.println(arrayList);

        System.out.println("2. iterating elements using traditional for loop");
        for (int index = 0; index < arrayList.size(); index++) {
            System.out.println(arrayList.get(index));
        }

        System.out.println("3. iterating elements using enhanced for loop");
        for (int temp : arrayList) {
            System.out.println(temp);
        }

        System.out.println("iterating elements using java 8 forEach method");
        Consumer<Integer> consumer1 = x -> System.out.println(x);
        Consumer<Integer> consumer = System.out::println;
        arrayList.forEach(consumer);

    }
}
