package collectionFramework.listImplmentations.vectorDemo;

import java.util.Vector;

public class Demo2AddAll {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("abc");
        vector.add("abc");
        vector.add(null);
        vector.add(null);
        vector.add(null);
        vector.add(123);
        vector.add(true);
        System.out.println(vector);

        Vector vector1 = new Vector();
        vector1.addAll(vector);
        System.out.println(vector1);


    }
}
