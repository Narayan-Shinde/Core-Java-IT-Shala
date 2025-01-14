package collectionFramework.mapImplementations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo2LinkedHashMap {
    public static void main(String[] args) {
        // keys restrictions
        //1. homo, heteo
        //2. unique keys
        //3. null(1)
        //4.  IO
        //5. no SO
        //6. unique check using equals and hashcode methods

        //Integer, String
        Map map = new LinkedHashMap();
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

        System.out.println(map);


    }
}
