import java.util.Stack;

public class stackEmptyMethode {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<Integer>();
        boolean result=stk.isEmpty();
        System.out.println("is empty or not? "+result);
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        System.out.println("elements are"+stk);
        System.out.println("is empty or not? "+result);
        stk.forEach(n->{
            System.out.println(n);
        });
    }
}
