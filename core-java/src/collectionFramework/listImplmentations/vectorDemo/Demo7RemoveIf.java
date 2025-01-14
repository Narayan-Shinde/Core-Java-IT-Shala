package collectionFramework.listImplmentations.vectorDemo;

import java.util.Vector;
import java.util.function.Predicate;

public class Demo7RemoveIf {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        //vector.add("abc");//CTE - generic type safety
        vector.add(100);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(22);
        vector.add(63);
        System.out.println("before removal " + vector);

        Predicate<Integer> predicate = number -> number % 2 == 0;
        vector.removeIf(predicate);

        System.out.println("after removal " + vector);
    }
}
