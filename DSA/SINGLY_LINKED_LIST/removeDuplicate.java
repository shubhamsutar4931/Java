import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(Arrays.asList(1,2,3,4,1,2,3,5,6));
        System.out.println("original:"+list);
        removeD(list);
        System.out.println("after removing:"+list);
    }

    private static void removeD(LinkedList<Integer> list) {
        Set<Integer>set=new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }
}
