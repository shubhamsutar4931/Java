package MAP;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        Map<String, Integer> map1 = Collections.unmodifiableMap(map);
//        map1.put("D",30);


        //Java9 feature
        Map<Integer, String> immutableMap = Map.of(
                1, "Apple",
                2, "Banana",
                3, "Cherry"
        );

        System.out.println("Immutable Map: " + immutableMap);

        // immutableMap.put(4, "Date"); // ❌ Throws UnsupportedOperationExceptio
    }
}
