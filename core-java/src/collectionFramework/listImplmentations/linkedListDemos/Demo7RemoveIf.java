package collectionFramework.listImplmentations.linkedListDemos;

import java.util.LinkedList;
import java.util.function.Predicate;

public class Demo7RemoveIf {
    public static void main(String[] args) {
        LinkedList<Integer> arrayList = new LinkedList();
        arrayList.add(100);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(22);
        arrayList.add(63);
        System.out.println("before removal " + arrayList);

        Predicate<Integer> predicate = number -> number % 2 == 0;
        arrayList.removeIf(predicate);

        System.out.println("after removal " + arrayList);
    }
}
