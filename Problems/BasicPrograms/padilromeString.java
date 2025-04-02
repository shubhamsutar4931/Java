import java.util.Scanner;

public class padilromeString {
    public static void main(String[] arg)
    {
        String original,reverse="";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        original=sc.nextLine();
        int length=original.length();
        for(int i=length-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
        {
            System.out.println("palidrome");
        }
        else
        {
            System.out.println("not palidrome");
        }
    }
}
