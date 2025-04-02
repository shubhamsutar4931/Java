package SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate (ignored)
        System.out.println("HashSet: " + set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Apple"); // Duplicate (ignored)
        System.out.println("LinkedHashSet: " + set1);
    }
}
