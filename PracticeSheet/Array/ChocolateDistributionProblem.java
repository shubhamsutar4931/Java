import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m=3;
        int resul=findMinDiff(arr,m);
        if(resul!=-1)
        {
            System.out.println(resul);
        }
        else {
            System.out.println("not found min diff");
        }
    }
    static int findMinDiff(int arr[],int m)
    {
        int n=arr.length;
        if(m==0||n==0)
        {
            return -1;
        }
        if(n<m)
        {
            return -1;
        }
        Arrays.sort(arr);
        int mindiff=Integer.MAX_VALUE;
        for (int i=0;i+m-1<n;i++)
        {
            int diff=arr[i+m-1]-arr[i];
            if(diff<mindiff)
            {
                return diff;
            }
        }
        return -1;
    }
}
