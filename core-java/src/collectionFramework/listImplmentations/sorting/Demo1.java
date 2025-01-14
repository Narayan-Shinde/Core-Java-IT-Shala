package collectionFramework.listImplmentations.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        // since all wrapper classes implements Comparable, compareTo is overridden
        // now list is of type comparable
        List<Integer> list = new ArrayList();
        list.add(100);
        list.add(1);
        list.add(10);
        list.add(4);
        list.add(6);
        System.out.println("before sorting");
        list.forEach(System.out::println);


        //sorting --> by default it will be ascending order
        Collections.sort(list);

        System.out.println("after sorting");
        list.forEach(System.out::println);
    }
}
