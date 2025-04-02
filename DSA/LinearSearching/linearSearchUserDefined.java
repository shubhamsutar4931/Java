import java.util.Scanner;

public class linearSearchUserDefined {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array:");
        int n=sc.nextInt();
        System.out.println("enter number in array:");
        int arr[]=new int[n];
        for(int c=0;c<n;c++)
        {
            arr[c]=sc.nextInt();
        }
        System.out.println("enter key:");
        int key=sc.nextInt();
        System.out.println(key+" is found at index:"+linearsearch(arr,key));
    }
    public  static int linearsearch(int[] a, int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
