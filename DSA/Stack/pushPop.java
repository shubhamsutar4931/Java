import java.util.*;
public class pushPop {
    public static void main(String[] args) {
        Stack<Integer> stk=new Stack<>();
        System.out.println("stack:"+stk);
        pushElement(stk,10);
        pushElement(stk,20);
        pushElement(stk,30);
        pushElement(stk,40);
        pushElement(stk,50);
        popElement(stk);
        popElement(stk);
        try {
            popElement(stk);
        }
        catch (Exception e)
        {
            System.out.println("Stack is empty");
        }
    }
    static void pushElement(Stack stk, int x)
    {

        stk.push(x);
        System.out.println("push -> " + x);
        System.out.println("stack: " + stk);
    }
    static void popElement(Stack stk)
    {

        System.out.print("pop -> ");
        Integer x=(Integer) stk.pop();
        System.out.println(x);
        System.out.println("stack: " + stk);
    }
}
