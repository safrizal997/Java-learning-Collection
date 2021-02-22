package Program.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("A", "Abdi");
        map.put("B", "Beni");
        map.put("C", "Caca");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+ " : " + value);
            }
        });


    }
}
