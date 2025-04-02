//import java.util.String;
import java.util.Scanner;

public class subarr {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        String str[]=new String[n];
//        int sub[]=new int[n*(n+1)/2];
//        int temp=0;
//        for (int i = 0; i < n; i++) {
//            str.charAt(i)= s.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            sub[temp]= Arrays.stream(arr).spliterator(0,i+1);
     int n,sum=0,c=0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            sum = 0;
            for(int k=i;k<=j;k++)
            {
                sum+=a[k];

            }
             if(sum<0)c++;
        }
    }
    System.out.print(c);

    }
}
