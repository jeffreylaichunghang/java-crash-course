package collection_interface;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

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

    public static void main(String[] args) {
        // arraylist();
        linklist();
    }
}
