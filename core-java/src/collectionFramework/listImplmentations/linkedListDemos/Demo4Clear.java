package collectionFramework.listImplmentations.linkedListDemos;

import java.util.LinkedList;

public class Demo4Clear {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(100);
        linkedList.add(null);
        linkedList.add(null);
        linkedList.add("abc");
        linkedList.add("abc");
        linkedList.add(10.5f);
        linkedList.add(true);
        System.out.println("Before removal");
        System.out.println(linkedList);
        System.out.println("Before removal size " + linkedList.size());

        linkedList.clear();
        System.out.println("after removal");
        System.out.println(linkedList);
        System.out.println("After removal size " + linkedList.size());
    }
}
