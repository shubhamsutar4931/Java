import java.util.Stack;

public class peak {
    public static void main(String[] args) {
        Stack<String > stk=new Stack<>();
        stk.push("mango");
        stk.push("apple");
        stk.push("kiwi");
        stk.push("orange");
        stk.push("coconut");
        String  peak=stk.peek();
        System.out.println("peek:"+peak);
        int location=stk.search("kiwi");
        System.out.println("location at index:"+location);
        int size= stk.size();
        System.out.println("size:"+size);
    }
}
