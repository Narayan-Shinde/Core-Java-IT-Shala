package collectionFramework.listImplmentations.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        //this is list of objects of type Comparable
        List<String> list = new ArrayList<>();
        list.add("kundan");
        list.add("ajay");
        list.add("yash");
        list.add("dhanshree");
        list.add("mahetab");
        list.add("arti");
        list.add("sanika");
        list.add("ashish");

        System.out.println("before sorting");
        list.forEach(System.out::println);

        //sorting
        Collections.sort(list);

        System.out.println("after sorting");
        list.forEach(System.out::println);

    }
}
