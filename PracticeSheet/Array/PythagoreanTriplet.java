import java.util.Arrays;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        int arr[]={3,1,4,6,5};
        int n= arr.length;
        if(findPythaTriplet(arr,n))
        {
            System.out.println("Pythagorean Triplet exist");
        }
        else {
            System.out.println("Pythagorean Triplet not exist");
        }
    }
    static boolean findPythaTriplet(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
            arr[i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        for (int i=n-1;i>=2;i--)
        {
            for(int j=0;j<i-1;j++)
            {
                for (int k=j+1;k<i;k++)
                {
                    if(arr[j]+arr[k]==arr[i])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
