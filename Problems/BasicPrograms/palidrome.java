import java.util.Scanner;

public class palidrome {
    public static void main(String[] arg)
    {
        int r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("palidrome");
        }
        else
        {
            System.out.println("not palidrome");
        }
    }

}
