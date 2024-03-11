package collection_interface.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
/*
 * Collection
 *   - Queue
 *      - Deque
 *          - ArrayDeque
 *  ArrayDeque implements Deque and Queue
 *  implements a LIFO stacks
 */

public class ArrayDequeEx {
    public static void main(String[] args) {
        ArrayDeque<String> animals = new ArrayDeque<>();

        animals.add("Dogs");
        animals.addFirst("Cat");
        animals.addLast("Horse");

        animals.offer("Last Dog");
        animals.offerFirst("First Dog");
        animals.offerLast("last Dog");

        // System.out.println("ArrayDeque: " + animals);

        // System.out.println("First Element: " + animals.getFirst());
        // System.out.println("Last Element: " + animals.getLast());

        System.out.print("\n ArrayDeque in reverse order:");
        Iterator<String> desIterator = animals.descendingIterator();
        while (desIterator.hasNext()) {
            System.out.print(desIterator.next() + ", ");
        }
    }
}
