package Program.Collection.Map;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map =new TreeMap<>();

        map.put("C", "Cinta");
        map.put("A", "Aini");
        map.put("D", "Dona");
        map.put("B", "Bintang");

        for (var key : map.keySet()){
            System.out.println(key);
        }
        System.out.println("\n" +
                map.lowerKey("B"));

        System.out.println("\n"+map.higherKey("B"));


        //descending
        NavigableMap<String,String> mapDesc = map.descendingMap();

        for (var key1 : mapDesc.keySet()){
            System.out.println("\n"+key1);
        }

        //Immutable

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        //immutable.put("E", "Erhan"); error




    }
}
