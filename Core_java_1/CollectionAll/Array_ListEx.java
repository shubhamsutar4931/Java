//araay to list
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;

// public class Array_ListEx {
//     public static void main(String[] args) {
//         String[] array = { "php", "c++", "c", "java" };
//         // System.out.println(Arrays.toString(array));
//         List<String> list = new ArrayList<String>();
//         for (String lang : array) {
//             list.add(lang);
//         }
//         System.out.println(list);
//     }

// }

//list to array

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class Array_ListEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");
        list.add("Strawberry");
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }
}