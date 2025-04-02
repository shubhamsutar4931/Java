package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(31,"ajay");
        map.put(2,"vijay");
        map.put(11,"jay");
//        System.out.println(map);
//        System.out.println(map.get(31));
//        System.out.println(map.containsKey(2));
//        System.out.println(map.containsValue("ajay"));
        for (int item:map.keySet())
        {
            System.out.println(map.get(item));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry:entries)
        {
//            System.out.println(entry.getKey()+":"+entry.getValue());
            System.out.println(entry.getValue().toUpperCase());
        }

    }
}
