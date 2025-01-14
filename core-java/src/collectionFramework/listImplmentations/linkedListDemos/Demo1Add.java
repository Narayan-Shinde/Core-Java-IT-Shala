package collectionFramework.listImplmentations.linkedListDemos;

import java.util.LinkedList;

public class Demo1Add {
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
        System.out.println(linkedList);

    }
}
