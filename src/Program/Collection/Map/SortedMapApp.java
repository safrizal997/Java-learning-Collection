package Program.Collection.Map;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;

public class SortedMapApp {
    public static void main(String[] args) {

        Map<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("A", "Andi");
        sortedMap.put("B", "Bandi");
        sortedMap.put("C", "Candi");

        for (var key : sortedMap.keySet()){
            System.out.println(key);
        }

        System.out.println("\n");


        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2.compareTo(o1));
            }
        };

        Map<String,String> sortedMapWithComparator = new TreeMap<>(stringComparator);

        sortedMapWithComparator.put("A", "Abdul");
        sortedMapWithComparator.put("B", "Bedul");
        sortedMapWithComparator.put("C", "Citul");

        for (var key1 : sortedMapWithComparator.values()){
            System.out.println(key1);
        }

    }
}
