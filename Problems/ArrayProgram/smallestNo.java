import java.util.Arrays;

public class smallestNo {
    public static int getSmallest(int a[],int total)
    {
        Arrays.sort(a);
        return a[0];
//        return  a[1]; //2nd smallest
    }
    public static void main(String[] arg)
    {
        int arr[]={1,3,6,3,9,6};
        int arr1[]={20,30,61,37,19,62};
        System.out.println("Largest:"+ getSmallest(arr,6));
        System.out.println("Largest:"+ getSmallest(arr1,6));
    }
}
