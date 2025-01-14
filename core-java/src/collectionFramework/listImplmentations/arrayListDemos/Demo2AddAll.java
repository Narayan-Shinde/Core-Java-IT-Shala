package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo2AddAll {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(10.5f);
        arrayList.add(true);
        System.out.println(arrayList);

        ArrayList arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        arrayList2.add("new list");
        System.out.println(arrayList2);

    }
}
