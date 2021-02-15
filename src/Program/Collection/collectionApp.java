package Program.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class collectionApp {
    public static void main(String[] args) {

        Collection <String> collection = new ArrayList<>();

        collection.add("Safrizal");
        collection.add("Ijal");
        collection.add("Rizal");
        collection.addAll(List.of("Programmer", "Rzl", "Project" ));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("\nRemove");

        collection.remove("Ijal");
        collection.removeAll(List.of("Programmer"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("\nContains");
        System.out.println(
                collection.contains("Safrizal")
        );

        System.out.println(
                collection.containsAll(List.of("Project", "Rzl"))
        );

        System.out.println(
                collection.size()
        );


    }
}
