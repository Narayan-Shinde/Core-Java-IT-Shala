package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo8Contains {
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
        System.out.println(arrayList.contains(1100));
    }
}
