import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    static  boolean isArmstrong(int n)
    {
        int last=0,digits=0,sum=0,temp;
        temp=n;
        while (temp>0)
        {
            temp=temp/10;
            digits++;
        }
        temp=n;
        while (temp>0)
        {
            last=temp%10;
            sum += (Math.pow(last, digits));
            temp=temp/10;
        }
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();

//      for limit up to
        for(int i=0;i<=num;i++)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+" ");
            }
        }
//        if(isArmstrong(num))
//        {
//            System.out.println("armstrong");
//        }
//        else
//        {
//            System.out.println("not armstrong");
//        }
    }
}
