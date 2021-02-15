package Program.Collection;

import java.util.Iterator;
import java.util.List;

public class iterableApp {
    public static void main(String[] args) {

        Iterable <String> names=List.of("Rizal", "Ijal", "Safrizal");

        for (var name : names){
            System.out.println(name);
        }

        System.out.println("\nITERATOR");
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
