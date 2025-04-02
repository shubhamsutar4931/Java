import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetHash {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>();

        nums.add(43);
        nums.add(32);
        nums.add(81);
        nums.add(59);
        nums.add(49);

        // it does not repeat same value
        // it does not have idex values
        // Treeset gives sorted value
        System.out.println("Lowest Value: " + nums.pollFirst());
        System.out.println("Highest Value: " + nums.pollLast());
        for (int n : nums) {

            System.out.println(n * 2);
        }

    }

}
