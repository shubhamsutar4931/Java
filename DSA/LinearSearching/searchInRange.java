import java.util.Scanner;

public class searchInRange {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{11,12,13,15,46,54,25,78};
        Scanner sc=new Scanner(System.in);
        System.out.print("starting index:");
        int start=sc.nextInt();
        System.out.print("ending index:");
        int end=sc.nextInt();
        System.out.print("enter key:");
        int key=sc.nextInt();
        int ans=linearsearch(arr,key,start,end);
        System.out.print(key+" is found at index:"+ans);
    }
    public  static int linearsearch(int[] a, int key,int start,int end)
    {
        for(int i=start;i<=end;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
