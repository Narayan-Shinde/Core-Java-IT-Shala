package collectionFramework.listImplmentations.arrayListDemos;

import java.util.ArrayList;

public class Demo1Add {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100); // Integer
        arrayList.add(100);
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("abc");
        arrayList.add("abc");
        arrayList.add(10.5f);
        arrayList.add(true);
        System.out.println(arrayList);

    }
}
