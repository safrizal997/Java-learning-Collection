package Program.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        //List<String> strings = new LinkedList<>(); Optional tergantung kebutuhan

        strings.add("Rizal");
        strings.add("Budi");
        strings.add("Eko");
        strings.add("Salah");

        strings.set(1,"Ujang");

        strings.remove(3);

        System.out.println(strings.get(1));

        System.out.println("\nListname:");
        for (var value : strings){
            System.out.println(value);
        }

    }
}
