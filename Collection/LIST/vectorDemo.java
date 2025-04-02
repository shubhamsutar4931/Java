import java.util.Vector;

//it can check capacity and increase by 2x
public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(5,3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(4);
        System.out.println(vector.capacity());
        vector.add(4);
        System.out.println(vector.capacity());


    }
}
