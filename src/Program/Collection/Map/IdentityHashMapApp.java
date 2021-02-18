package Program.Collection.Map;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;

public class IdentityHashMapApp {
    public static void main(String[] args) {

        Map<String,String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        map.put(key1,"rizal");
        map.put(key2,"rizal");

        System.out.println(map.size());
    }
}
