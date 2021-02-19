package Program.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Rizal");
        map.put("middle", "Ijal");
        map.put("last", "Safrizal");

        Set<String> keys = map.keySet();

        for (var key: keys){
            System.out.println(key);
        }

    }
}
