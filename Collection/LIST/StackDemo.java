import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println( stack.peek());
        System.out.println( stack.search(3));     //index starting from peak and start from 1 not from 0

    }
}
