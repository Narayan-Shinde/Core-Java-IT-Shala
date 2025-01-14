package collectionFramework.setImplementations;

import java.util.HashSet;

public class Demo1HashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(100);
        set.add(100);
        set.add(200);
        set.add(200);
        set.add(null);
        set.add(null);
        set.add(true);
        set.add(false);
        set.add("abc");
        set.add("abc");
        set.add(0.5f);
        set.forEach(System.out::println);
        //1. unique
        //2. null only once
        //3. homogenous as well as heterogenous
        //4. no insertion order
        //5. no sorting order
        //6. uniqueness using equals and hashCode

    }
}
