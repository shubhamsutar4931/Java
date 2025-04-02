import java.util.Arrays;

public class MinimumPlatforms {
    static int findMinimumP(int arr[],int dep[])
    {
        int n= arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int platform=0;
        int result=0;
        int i=0,j=0;
        while(i<n&&j<n)
        {
            if(arr[i]<dep[j])
            {
                platform++;
                i++;
                result=Math.max(result,platform);
            }
            else {
                platform--;
                j++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findMinimumP(arr,dep));
    }
}
