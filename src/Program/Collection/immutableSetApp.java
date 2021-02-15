package Program.Collection;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class immutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Ijal");

        Set<String> mutable = new HashSet<>();
        mutable.add("Rizal");
        mutable.add("Ijal");

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Andi", "Safrizal");

        //set.add("Bocil"); error cause set is immutable
        //set.remove("Andi");
    }
}
