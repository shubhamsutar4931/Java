package MAP;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCatche<K,V> extends LinkedHashMap<K,V> {

    private int capacity;
    public LRUCatche(int capacity)
    {
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCatche<String,Integer> student=new LRUCatche<>(3);
        student.put("bob",99);
        student.put("alice",91);
        student.put("ram",95);
        student.put("sham",96);
        System.out.println(student);
    }
}
