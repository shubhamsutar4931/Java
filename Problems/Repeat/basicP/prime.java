import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println("list "+s+"between"+e);
        for (int i=s;i<e;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i+" ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
