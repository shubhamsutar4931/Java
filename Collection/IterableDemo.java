import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IterableDemo {
    public static void main(String[] args) {
        List<Integer> numbers=new  ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        Iterator <Integer> itr=numbers.iterator();
        while (itr.hasNext())
        {
            Integer number= itr.next();
            if(number %2==0)
            {
                itr.remove();
            }
        }
        System.out.println(numbers);
    }
}
