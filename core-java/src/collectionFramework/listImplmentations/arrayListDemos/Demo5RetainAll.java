package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo5RetainAll {
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

        ArrayList retentionList = new ArrayList();
        retentionList.add("abc");
        retentionList.add(10.5f);

        System.out.println("Before removal");
        System.out.println(arrayList);
        System.out.println("Before removal size " + arrayList.size());

        arrayList.retainAll(retentionList);
        System.out.println("after removal");
        System.out.println(arrayList);
        System.out.println("After removal size " + arrayList.size());
    }
}
