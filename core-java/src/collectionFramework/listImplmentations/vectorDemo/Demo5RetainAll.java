package collectionFramework.listImplmentations.vectorDemo;

import java.util.Vector;

public class Demo5RetainAll {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(100);
        vector.add(100);
        vector.add(null);
        vector.add(null);
        vector.add("abc");
        vector.add("abc");
        vector.add(10.5f);
        vector.add(true);

        Vector retentionList = new Vector();
        retentionList.add("abc");
        retentionList.add(10.5f);

        System.out.println("Before removal");
        System.out.println(vector);
        System.out.println("Before removal size " + vector.size());

        vector.retainAll(retentionList);
        System.out.println("after removal");
        System.out.println(vector);
        System.out.println("After removal size " + vector.size());
    }
}
