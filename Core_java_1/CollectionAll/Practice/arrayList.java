package Practice;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(2, 10);
        list.add(2, 100);
        list.remove(list.lastIndexOf(10));
        System.out.println(list);

        // List<Integer> list2 = new ArrayList<Integer>();
        // list2.add(10);
        // list2.add(22);
        // list2.add(33);
        //
        // System.out.println(list);
        // list.addAll(list2);//concate
        // System.out.println(list);

        // list.removeAll(list2);//remove same element

        // list.retainAll(list2);//remove not same element
        //
        // System.out.println(list.size());
        // System.out.println(list.contains(20));
        // list.remove(0);
        // list.remove(Integer.valueOf(20));
        // System.out.println(list);
        //
        // Object a[]=list.toArray();
        // for(Object e:a)
        // {
        // Integer temp=(Integer) e;
        // System.out.print(e+" ");
        // }
    }
}
