import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(10);
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//        list.remove(2);
//        list.add(2,80);//add
//        list.set(2,80);//replace
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        for (int i:list)
//        {
//            System.out.println(i);
//        }
//
//        System.out.println(list.contains(2));
//        System.out.println(list.contains(3));

        ArrayList<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(3);
//        List<Integer> list1 = List.of(4, 5, 6, 7, 8, 9);   //java 9 feature inmutable
//        list.addAll(list1);
//        System.out.println(list);
//        list.remove(Integer.valueOf(1));//value ne remove kela
//        System.out.println(list);


//        Collections.sort(list);
        list.sort(null);
        System.out.println(list);
    }

}
