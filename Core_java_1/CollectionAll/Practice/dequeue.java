package Practice;

import java.util.ArrayDeque;

public class dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> de=new ArrayDeque<>();
//        de.offer(10);
//        de.offerLast(20);
//        de.offerFirst(30);
//        System.out.println(de);
//        de.pollFirst();
//        de.pollLast();

        //stack
        de.push(10);
        de.push(11);
        de.push(12);
        System.out.println(de);
        System.out.println(de.pop());
        System.out.println(de);
    }
}
