import java.util.Scanner;

public class primeRange {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter start range:");
        int start=sc.nextInt();
        System.out.print("enter end range:");
        int end=sc.nextInt();
        System.out.println("start:"+start+" "+"end:"+end);
        for(int i=start;i<end;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }

        }
    }
    public static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        else
        {
            for(int i=2;i<=n/2;i++)
            {
                if(n%i==0)
                {
                    return false;
                }

            }
            return true;
        }

    }

}
