package QUEUE;

import java.util.concurrent.*;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Produced: " + i);
                queue.put(i); // Blocks if full
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                int value = queue.take(); // Blocks if empty
                System.out.println("Consumed: " + value);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);
//        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(3);
//        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>(3);

        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();
    }
}
