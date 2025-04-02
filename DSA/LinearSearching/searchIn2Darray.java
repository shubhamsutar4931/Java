import java.util.Arrays;

public class searchIn2Darray {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3},
                {4,55,6},
                {7,8,99}
        };
        int key=6;
        int[] ans =search(arr,key);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    public static int[] search(int[][] arr, int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j< arr.length;j++)
            {
                if(arr[i][j]==key)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int max(int[][] arr)
    {
        int max=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j< arr.length;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
}
