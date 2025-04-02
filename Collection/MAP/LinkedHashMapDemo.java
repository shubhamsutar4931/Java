package MAP;

import java.util.LinkedHashMap;
import java.util.Map;
//double linked list
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(11,0.3f,true);
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("mango",20);
        linkedHashMap.put("apple",30);
        for (Map.Entry<String, Integer> entry:linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        Integer res=linkedHashMap.getOrDefault("shubham",0);
        System.out.println(res);
        linkedHashMap.putIfAbsent("shubham",40);
        System.out.println(linkedHashMap);
        linkedHashMap.get("mango");
        System.out.println(linkedHashMap);
    }
}
