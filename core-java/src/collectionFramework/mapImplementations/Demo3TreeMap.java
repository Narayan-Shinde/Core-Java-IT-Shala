package collectionFramework.mapImplementations;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo3TreeMap {
    public static void main(String[] args) {
        //Integer, String
        // keys restrictions / no restrictions on value
        //1. homo
        //2. unique keys
        //3. null(0)
        //4. no IO
        //5.  SO
        //6. unique check using compare, compareTo methods
        Map map = new TreeMap();
        map.put(12, "yash");
        map.put(2, "kundan");
        map.put(3, "amruta");
        map.put(4, "satish");
        map.put(5, "vishwadeep");
        map.put(5, "vishwadeep");
     //   map.put(null, "vishwadeep");
       // map.put(null, null);
        //map.put(true, null);
        //map.put(false, null);

        System.out.println(map);


    }
}
