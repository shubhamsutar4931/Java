import org.w3c.dom.ls.LSOutput;

public class smallestNoTernaryOpe {
    public static void main(String[] arg)
    {
        int a=12,b=13,c=14;
        int temp=(a<b)?a:b;
        int smallest=(c<temp)?c:temp;
        System.out.println(smallest);
    }
}
