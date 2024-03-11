package collection_interface.Queue;

import java.util.Deque;
import java.util.LinkedList;

/*
 *  - Queue
 *      - Deque
 *          - ArrayDeque
 *          - LinkedList
 */

public class DequeEx {

    public static void linkedList() {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("LinkedList: " + animals);

        animals.add(1, "Horse");
        System.out.println("add horse at first index: " + animals);
        System.out.println("element at index 1: " + animals.get(1));

        animals.set(1, "Donkey");
        System.out.println("change horse to donkey: " + animals);

        animals.remove(1);
        System.out.println("remove donkey: " + animals);

        System.out.println(animals.peek());
    }

    public static void main(String[] args) {
        linkedList();
    }
}
