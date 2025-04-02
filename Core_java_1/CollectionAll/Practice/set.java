package Practice;

import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Integer> s=new HashSet<>();
        s.add(10);
        s.add(10);
        s.add(20);
        s.add(10);
        s.add(20);
        System.out.println(s);
    }
}
