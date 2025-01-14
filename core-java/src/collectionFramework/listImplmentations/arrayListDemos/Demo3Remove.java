package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo3Remove {
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
        System.out.println("Before removal");
        System.out.println(arrayList);

        arrayList.remove(true);
        System.out.println("after removal");
        System.out.println(arrayList);

    }
}
