import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class simple {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(3,400);

        System.out.println(list);  //Q1
        System.out.println(list.size());   //Q3
        System.out.println(list.reversed());  //Q4
//        list.remove(0);    //Q5
//        list.remove(2); //Q6
        list.remove(3);
        System.out.println(list);
    }
}
