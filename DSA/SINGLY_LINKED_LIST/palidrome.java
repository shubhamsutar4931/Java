import java.util.*;

public class palidrome {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(1,2,3,2,1));
        if(isPalidrome(list))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not");
        }
    }

    public static boolean isPalidrome(LinkedList<Integer> list) {
        Deque<Integer> deque=new ArrayDeque<>(list);
        while (!deque.isEmpty())
        {
            if(deque.size()==1){
                break;
            }
            if(!Objects.equals(deque.pollFirst(),deque.pollLast()))
            //pollFirst() retrieves and removes the first element.
            //pollLast() retrieves and removes the last element.
            {
                return false;
            }
        }
        return true;
    }
}
