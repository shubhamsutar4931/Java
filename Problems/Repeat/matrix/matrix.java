import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
