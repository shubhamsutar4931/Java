package QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10); // Add at the front
        deque.addLast(20);  // Add at the end
        deque.offerFirst(5); // Alternative method
        deque.offerLast(25);

        System.out.println("Deque: " + deque); // Output: [5, 10, 20, 25]

        System.out.println("Removed First: " + deque.removeFirst()); // Removes 5
        System.out.println("Removed Last: " + deque.removeLast());   // Removes 25

        System.out.println("Deque after removal: " + deque); // Output: [10, 20]

    }
}
