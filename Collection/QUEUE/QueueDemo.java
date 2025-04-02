package QUEUE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(2);
        System.out.println(queue.remove()); //throws exception
        System.out.println(queue.poll());
        System.out.println(queue.peek());
//        System.out.println(queue.element());//throws exception


        Queue<Integer> queue1=new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1));  //true
        System.out.println(queue1.offer(2));  //true
        System.out.println(queue1.offer(3));  //false
//        System.out.println(queue1.add(3));//throws exception

    }
}
