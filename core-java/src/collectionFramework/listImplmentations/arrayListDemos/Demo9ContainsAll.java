package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo9ContainsAll {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        //arrayList.add("abc");//CTE - generic type safety
        arrayList.add(100);
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(22);
        arrayList.add(63);
        System.out.println(arrayList);

        ArrayList<Integer> searchList = new ArrayList<>();
        searchList.add(11);
        searchList.add(12);
        searchList.add(14);

        System.out.println("Whether my list is present in the given list : "+arrayList.containsAll(searchList));
    }
}
