package Program.Collection.Map;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;
import java.util.stream.Collector;

public class SortedMapApp {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("B", "Andi");
        sortedMap.put("C", "Bandi");
        sortedMap.put("A", "Candi");

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

        SortedMap<String,String> sortedMapWithComparator = new TreeMap<>(stringComparator);

        sortedMapWithComparator.put("B", "Abdul");
        sortedMapWithComparator.put("C", "Bedul");
        sortedMapWithComparator.put("A", "Citul");

        for (var key1 : sortedMapWithComparator.values()){
            System.out.println(key1);
        }

        //Immutable Sorted Map

        Map<String,String> empty = Collections.emptySortedMap();
        Map<String, String> immutableSortedMap = Collections.unmodifiableSortedMap(sortedMap);

        //immutableSortedMap.put("D", "Deni"); error

    }
}
