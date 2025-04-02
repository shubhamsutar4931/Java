import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionAPI {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(4);
        nums.add(4);
        nums.add(8);
        nums.add(5);

        // System.out.println(nums.get(0));
        // System.out.println(nums.indexOf(8));

        // Traversing list through for-each loop
        for (Object n : nums) {
            int num = (Integer) n;
            System.out.println(num * 2);
        }

        // Iterator itr=nums.iterator();//getting the Iterator
        // while(itr.hasNext()){//check if iterator has the elements
        // System.out.println(itr.next());//printing the element and move to next
        // }
        System.out.println(nums);
    }
}
