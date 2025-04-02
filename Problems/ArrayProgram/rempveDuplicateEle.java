import java.util.Arrays;

public class rempveDuplicateEle {
    public static int getwithoutduplicate(int[] arr, int n)
    {
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
                {
                    temp[j++]=arr[i];
                }
        }
        temp[j++]=arr[n-1];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=temp[i];
        }
        return j;
    }
    public static void main(String[] arg)
    {
        int arr[] = {10,70,30,90,20,20,30,40,70,50};//unsorted array
        Arrays.sort(arr);
        int length = arr.length;
        length = getwithoutduplicate(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
            System.out.print(arr[i]+" ");
    }
}
