import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int count=10;
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=2;i<=count;i++)
        {
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}
