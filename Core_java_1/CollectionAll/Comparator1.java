import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1 {
    public static void main(String[] args) {
        // to sorting according to last digit
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };
        List<Integer> nums = new ArrayList<>();

        nums.add(43);
        nums.add(32);
        nums.add(81);
        nums.add(59);
        nums.add(49);
        Collection.sort(nums, com);

        System.out.println(nums);
    }

}
