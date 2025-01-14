package collectionFramework.listImplmentations.linkedListDemos;

import java.util.LinkedList;

public class Demo8Contains {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        //linkedList.add("abc");//CTE - generic type safety
        linkedList.add(100);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(22);
        linkedList.add(63);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(1100));
    }
}
