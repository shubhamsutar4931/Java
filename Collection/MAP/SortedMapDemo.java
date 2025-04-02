package MAP;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> map=new TreeMap<Integer, String>(); //sorted in asc order &use TreeMap because it provide inbuild overridding
//        SortedMap<Integer,String> map=new TreeMap<Integer, String>((a,b)->b-a);  //sorted in des order
        map.put(99,"sham");
        map.put(70,"ram");
        map.put(91,"amar");
        map.put(88,"ravi");


//        System.out.println(map);
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(91));
//        System.out.println(map.tailMap(91));
//        System.out.println(map.subMap(88,99));


        // It provides navigation methods to get the closest keys higher, lower, ceiling, and floor.
        NavigableMap<Integer,String > navigableMap=new TreeMap<>();
        navigableMap.put(1,"one");
        navigableMap.put(5,"five");
        navigableMap.put(3,"three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.descendingMap());
    }
}
