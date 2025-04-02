import java.util.Arrays;

public class largestNo {
    //traditional method
    /*public static int getLarger(int[] arr, int total)
    {
        int temp;
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[total-1];
    }
    public static void main(String[] arg)
    {
        int arr[]={1,3,6,3,9,6};
        int arr1[]={20,30,61,37,19,62};
        System.out.println("Largest:"+ getLarger(arr,6));
        System.out.println("Largest:"+ getLarger(arr1,6));
    }*/

//    collection method
public static int getLarger(int[] arr)
{
    Arrays.sort(arr);
    return arr[arr.length-1]; //largest
//    return arr[total-2]; //2nd largest
//    return arr[total-3]; //3rd largest
}
    public static void main(String[] arg)
    {
        int arr[]={1,3,6,3,9,6};
        int arr1[]={20,30,61,37,19,62};
        System.out.println("Largest:"+ getLarger(arr));
        System.out.println("Largest:"+ getLarger(arr1));
    }

}
