package collectionFramework.listImplmentations.vectorDemo;

import java.util.Vector;

public class Demo8Contains {
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
        System.out.println(vector.contains(1100));
    }
}
