package QUEUE;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueDemo {
        public static void main(String[] args) {
            ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

            queue.add(10);
            queue.add(20);
            queue.add(30);

            System.out.println("Queue: " + queue);  // Output: [10, 20, 30]

            System.out.println("Removed: " + queue.poll()); // Removes 10
            System.out.println("Queue after poll: " + queue); // Output: [20, 30]
        }

}
