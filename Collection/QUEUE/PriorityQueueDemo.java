package QUEUE;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
//        Queue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        queue.add(15);
        queue.add(10);
        queue.add(30);
        queue.add(5);
        System.out.println(queue);  //not sorted
        while (!queue.isEmpty())  //sorted
        {
            System.out.println(queue.poll());
        }
    }
}
