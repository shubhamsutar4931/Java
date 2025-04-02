import java.util.Arrays;

public class asendingOrder {
    public static void main(String[] arg)
    {
        int temp;
        int arr[]=new int[]{18,12,13,14,20};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[i]>arr[j])
//                {
//                    temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        collection method
        Arrays.sort(arr);
        System.out.println("Asending order::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
