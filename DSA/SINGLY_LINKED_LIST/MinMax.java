import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>(Arrays.asList(4,3,6,1));
        list.sort(null);
        System.out.println("max:"+list.getLast());
        System.out.println("min:"+list.getFirst());
    }
}
