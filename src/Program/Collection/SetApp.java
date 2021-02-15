package Program.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Rizal");
        names.add("Ijal");
        names.add("Eko");
        names.add("Rizal");
        names.add("Ijal");
        names.add("Eko");

        for (var value : names){
            System.out.println(value);
        }

        System.out.println("\nBerurutan");
        Set<String> names1 = new LinkedHashSet<>();

        names1.add("Juli");
        names1.add("Neo");
        names1.add("Ijal");
        names1.add("Juli");
        names1.add("Neo");
        names1.add("Ijal");

        for (var value1 : names1){
            System.out.println(value1);
        }

    }
}
