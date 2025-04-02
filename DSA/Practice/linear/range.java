package linear;

import java.util.Scanner;

public class range {
    public static void main(String[] args) {
        int arr[]=new int[]{11,12,13,15,46,54,25,78};
        Scanner sc=new Scanner(System.in);
        System.out.println("starting:");
        int start= sc.nextInt();
        System.out.println("ending:");
        int end= sc.nextInt();
        System.out.println("key:");
        int key= sc.nextInt();
        System.out.println(rangeBet(arr,start,end,key));
    }
    static int rangeBet(int arr[],int s,int e,int k)
    {
        for (int i = s; i <e; i++) {
            if(arr[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
}
