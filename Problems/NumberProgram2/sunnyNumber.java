import java.util.Scanner;

public class sunnyNumber {
    public static boolean isSunny(int num)
    {
        if(Math.sqrt(num+1)%1==0)
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
        System.out.print("lower range:");
        int lr=sc.nextInt();
        System.out.print("upper range:");
        int ur=sc.nextInt();
        for(int i=lr;i<=ur;i++) {
            if (isSunny(i)) {
                System.out.print(i+" ");
            }
        }
    }

}
