package Program.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name1","Rizal");
        map.put("name2","Safrizal");
        map.put("name3","Ijal");

        System.out.println(map.get("name1"));
        System.out.println(map.get("name2"));
        System.out.println(map.get("name3"));

    }
}
