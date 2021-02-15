package Program.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;

public class immutableApp {
    public static void main(String[] args) {

        List<String> empty = Collections.emptyList();
        List<String> one = Collections.singletonList("satu");
        List<String> mutable = new ArrayList<>();
        mutable.add("Rizal");
        mutable.add("Ijal");
        mutable.add("Eko");

        List<String> element = List.of("Programmer", "Rzl", "Project");
        //element.add("Salah"); error cause element list is immutable

        System.out.println(mutable);
    }
}
