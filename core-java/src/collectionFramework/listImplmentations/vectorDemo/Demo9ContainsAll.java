package collectionFramework.listImplmentations.vectorDemo;

import java.util.ArrayList;
import java.util.Vector;

public class Demo9ContainsAll {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        //vector.add("abc");//CTE - generic type safety
        vector.add(100);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(22);
        vector.add(63);
        System.out.println(vector);

        ArrayList<Integer> searchList = new ArrayList<>();
        searchList.add(11);
        searchList.add(12);
        searchList.add(13);

        System.out.println("Whether my list is present in the given list : " + vector.containsAll(searchList));
    }
}
