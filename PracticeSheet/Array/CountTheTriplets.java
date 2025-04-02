import java.util.Arrays;

public class CountTheTriplets {
    static int findTriplet(int arr[])
    {
        int count=0;
        int n= arr.length;
        Arrays.sort(arr);
        for(int k=n-1;k>=2;k--)
        {
            int i=0;
            int j=k-1;
           while(i<j)
           {
               if(arr[i]+arr[j]==arr[k])
               {
                   count++;
                   i++;
                   j--;
               }
               else if(arr[i]+arr[j]<arr[k])
               {
                   i++;
               }
               else {
                   j--;
               }
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,2};
        int result=findTriplet(arr);
        System.out.println(result);
    }
}
