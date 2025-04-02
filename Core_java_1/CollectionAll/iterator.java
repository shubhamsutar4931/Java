import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class iterator {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();

        nums.add(43);
        nums.add(32);
        nums.add(81);
        nums.add(59);
        nums.add(49);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

    }

}
