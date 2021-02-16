package Program.Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.offerFirst("Andi");
        deque.offerFirst("Budi");
        deque.offerFirst("Cindi");

        for (var value : deque){
            System.out.println(value);
        }
        System.out.println("\npoll");
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());

        System.out.println("\nelement");
        System.out.println(deque.element());

        System.out.println(deque.size());

    }
}
