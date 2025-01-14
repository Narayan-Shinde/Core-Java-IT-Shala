package collectionFramework.setImplementations;

import java.util.TreeSet;

public class Demo3TreeSet {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(90);
        set.add(80);
        set.add(200);
        set.add(200);
        //set.add(null);
        //set.add(null);
      //  set.add(true);
       // set.add(false);
        //set.add("abc");
        //set.add("abc");
        //set.add(0.5f);
        set.forEach(System.out::println);

        //1. unique
        //2. null not even once  othterwise - NPE
        //3. only homogenous
        //4. no insertion order
        //5. sorting order
        //6. uniqueness using compare or compareTo

    }
}
