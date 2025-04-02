package Practice;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String ,String> map= new HashMap<>();
        map.put("USA","United States");
        map.put("IN","India");
        map.put("UK","Britain");
        map.put("ENG","Britain");
        map.putIfAbsent("ENG","England");

//        map.remove("IN","India");
//        System.out.println(map);
//        System.out.println(map.containsKey("UK"));
//        System.out.println(map.get("USA"));
//        System.out.println(map.getOrDefault("IN","ENG"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        ArrayList<String>key=new ArrayList<>(map.keySet());
        System.out.println(key);
        Collection<String>val=map.values();
        System.out.println(val);
    }
}
