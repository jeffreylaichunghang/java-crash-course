package collection_interface;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;
import java.util.Stack;

/*
 * List:
 *  - ArrayList
 *   => resizable-arrays
 *
 *  - LinkedList
 *
 */

class Main {

    public static void arraylist() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("list: " + numbers);

        int number = numbers.get(2); // get(index)
        System.out.println("Access element: " + number);

        int removeNumber = numbers.remove(1);
        System.out.println("Removed element: " + removeNumber);

        System.out.println("final list: " + numbers);
    }

    public static void linklist() {
        List<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("list: " + numbers);

        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        int index = numbers.indexOf(2);
        System.out.println("Position of 2 is " + index);

        int removeNumber = numbers.remove(1);
        System.out.println("Removed element: " + removeNumber);
    }

    public static void vector() {
        Vector<String> mammals = new Vector<>();
        Vector<String> animals = new Vector<>();

        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        animals.add("Crocodile");
        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);

        Iterator<String> iterator = animals.iterator();
        System.out.println("Iterator vector: " + iterator);
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }

        animals.clear();
        System.out.println();
        System.out.println("Vector after clear: " + animals);
    }

    public static void stack() {
        // ! ArrayDeque is better than Stack
        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);

        String animal = animals.pop();
        System.out.println("Removed Element: " + animal);

        // get the top element
        String topElement = animals.peek();
        System.out.println("Top element: " + topElement);

        int dogIndex = animals.search("Dog");
        System.out.println("Position of Horse: " + dogIndex);
        System.out.println("Is the stack empty ? " + animals.empty());
    }

    public static void main(String[] args) {
        // arraylist();
        // linklist();
        // vector();
        stack();
    }
}
