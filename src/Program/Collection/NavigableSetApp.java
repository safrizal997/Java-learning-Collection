package Program.Collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();

        names.addAll(Set.of("ARizal","BIJal","CSafrizal","DEko"));

        for(var name : names){
            System.out.println(name);
        }
        System.out.println("\ndescendingSet");
        NavigableSet<String> nameReverse  = names.descendingSet();

        for (var name1 : nameReverse){
            System.out.println(name1);
        }

        System.out.println("\nheatSet");
        NavigableSet<String> B = names.headSet("BIjal",true);

        for (var name2 : B){
            System.out.println(name2);
        }

        System.out.println("\ntailSet");
        NavigableSet<String> B1 = names.tailSet("BIjal",true);

        for (var name3 : B1){
            System.out.println(name3);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        //immutable.add("WrongName");

    }
}
