package Program.Collection;

import java.util.Arrays;
import java.util.List;

public class ConvertToArrayApp {
    public static void main(String[] args) {

        List <String> names = List.of("Rizal", "Eko", "Budi");



        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}
