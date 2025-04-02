import java.util.Scanner;

public class asending {
    public static void main(String[] args) {
        int temp=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array numbers:");
        int arr[]=new int[4];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

//        asending
//        for(int i=0;i< arr.length;i++)
//        {
//            for(int j=i+1;j< arr.length;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i< arr.length;i++)
//        {
//            System.out.print(arr[i]);
//        }

//        decending
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
