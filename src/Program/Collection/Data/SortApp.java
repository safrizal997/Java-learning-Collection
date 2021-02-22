package Program.Collection.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Just fot List
public class SortApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.addAll(List.of("Cika", "kurnia", "Bima", "Honda", "zela"));

        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }

        System.out.println("\n");
        //with comparator
        Comparator<String> listDesc = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2.compareTo(o1));
            }
        };
        Collections.sort(list,listDesc);
        for (var value1 : list){
            System.out.println(value1);
        }

    }
}
