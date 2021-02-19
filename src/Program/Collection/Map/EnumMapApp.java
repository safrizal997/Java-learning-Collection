package Program.Collection.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static enum Level {
        STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.STANDARD, "Bronze");
        map.put(Level.PREMIUM, "Silver");
        map.put(Level.VIP, "Gold");

        for (var key : map.keySet()){
           // System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
