package collection_interface.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
/*
 * Interface BlockingQueue
 *  - ArrayBlockingQueue
 *  - LinkedBlockingQueue
 *
 *  helpful in multi-threading operation
 */

public class BlockingQueueEx {
    public static void main(String[] args) {
        BlockingQueue<Integer> numbers = new ArrayBlockingQueue<>(5);

        try {
            numbers.put(2);
            numbers.put(1);
            numbers.put(3);
            System.out.println("BlockingQueue: " + numbers);

            int removedNumber = numbers.take();
            System.out.println("remove number: " + removedNumber);
        } catch (Exception e) {
            // TODO: handle exception
            e.getStackTrace();
        }
    }
}
