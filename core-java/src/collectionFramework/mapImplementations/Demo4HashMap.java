package collectionFramework.mapImplementations;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4HashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "yash");
        map.put(2, "kundan");
        map.put(3, "amruta");
        map.put(4, "satish");
        map.put(5, "vishwadeep");
        map.put(5, "vishwadeep");
        map.put(null, "vishwadeep");
        map.put(null, null);
        map.put(true, null);
        map.put(false, null);

        //1. only keys --> onlyKeys
        System.out.println("************** only keys *******************");
        Set onlyKeys = map.keySet();
        for (Object key : onlyKeys) {
            System.out.println(key);
        }
        //onlyKeys.forEach(System.out::println);

        //2. only onlyValues --> onlyValues
        System.out.println("************** only onlyValues *******************");
        Collection onlyValues = map.values();
        for (Object key : onlyValues) {
            System.out.println(key);
        }

        //3. both key and values -- entrySet
        Set<Map.Entry> set = map.entrySet();
        for (Map.Entry entry : set) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }
}
