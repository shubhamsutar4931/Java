package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("banana");
        list.add("kiwi");
        list.add("mango");
        list.add("apple");
        list.add("papaya");

        for(int i=0;i<list.size();i++)
        {
            System.out.println("fruits: "+list.get(i));
        }

        for(String l:list)
        {
            System.out.println("fruits for each: "+l);
        }

        Iterator<String> le=list.iterator();
        while (le.hasNext())
        {
            System.out.println("iterator: "+le.next());
        }

        List<String> sub=list.subList(1,3);
        System.out.println(sub);
    }
}
