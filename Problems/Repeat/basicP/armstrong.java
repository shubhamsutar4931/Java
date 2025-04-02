import java.util.Scanner;
import java.util.*;
//import static jdk.internal.org.jline.utils.Colors.s;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println("list "+s+"between"+e);
        for (int i=s;i<e;i++)
        {
            if(isArm(i))
            {
                System.out.println(i+" ");
            }
        }
    }
    private static boolean isArm(int n)
    {
        int temp,digit=0,last=0,sum=0;
        temp=n;
        while (temp>0)
        {
            temp=temp/10;
            digit++;
        }
        temp=n;
        while (temp>0)
        {
            last=temp%10;
            sum += Math.pow(last,digit);
            temp=temp/10;
        }
        if(n==sum)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
