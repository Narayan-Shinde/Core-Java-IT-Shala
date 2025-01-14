package collectionFramework.listImplmentations.linkedListDemos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo9ContainsAll {
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

        ArrayList<Integer> searchList = new ArrayList<>();
        searchList.add(11);
        searchList.add(12);
        searchList.add(139);

        System.out.println("Whether my list is present in the given list : "+linkedList.containsAll(searchList));
    }
}
