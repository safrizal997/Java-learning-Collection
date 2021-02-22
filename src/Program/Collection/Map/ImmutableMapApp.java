package Program.Collection.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleTon = Collections.singletonMap("name", "Rizal");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Ijal");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        //immutable.put("age","23"); error

        Map<String, String> map = Map.of(
                "name", "Rizal",
                "Gen","Male",
                "age","23"
        );
        //map.put("a", "A"); error


    }
}
