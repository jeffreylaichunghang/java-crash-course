package collection_interface.Queue;

import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Comparator;

/*
 * Queue interface:
 *  - Array Deque
 *  - LinkedList
 *  - PriorityQueue
 */

// heap data structure
public class PriorityQueueEx {

    public static void main(String[] args) {
        // create a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>(new CustomComparator());

        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Priority queue :" + numbers);

        // numbers.offer(1);
        // System.out.println("updated queue :" + numbers);

        // int number = numbers.peek(); // return head of the queue
        // System.out.println("access element :" + number);

        // int remove_num = numbers.poll();
        // System.out.println("removed element :" + remove_num);

        // boolean remove_four = numbers.remove(4);
        // System.out.println("4 removed ? " + remove_four);

        // Iterator<Integer> iterator = numbers.iterator();
        // while (iterator.hasNext()) {
        // System.out.print(iterator.next());
        // System.out.print(", ");
        // }

        // boolean contain_ten = numbers.contains(10);
        // System.out.println("contain number 10 ? " + contain_ten);

        // System.out.println("Size of the queue : " + numbers.size());
        // System.out.println("queue array : " + numbers.toArray());
    }
}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        int value = num1.compareTo(num2);

        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
