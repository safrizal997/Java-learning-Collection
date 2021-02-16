package Program.Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>(10);
        Queue<String> queue1 = new ArrayDeque<>(10);

        for (int i = 0; i < 10; i++) {
            queue.add(String.valueOf(i));
        }

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }
        System.out.println("\n");
        queue1.add("Anggun");
        queue1.add("Budi");
        queue1.add("Cindi");

        for (String next = queue1.poll(); next != null; next = queue1.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());
        System.out.println(queue1.size());


    }
}
