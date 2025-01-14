package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo6RemoveAll {
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

        ArrayList removalList = new ArrayList();
        removalList.add("abc");
        removalList.add(10.5f);

        System.out.println("Before removal");
        System.out.println(arrayList);
        System.out.println("Before removal size " + arrayList.size());

        arrayList.removeAll(removalList);
        System.out.println("after removal");
        System.out.println(arrayList);
        System.out.println("After removal size " + arrayList.size());
    }
}
