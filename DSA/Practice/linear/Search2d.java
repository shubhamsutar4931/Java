package linear;

import java.util.Arrays;

public class Search2d {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 55, 6},
                {7, 8, 99}
        };
        int key=6;
        int ans[]=search(arr,key);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    public static int[] search(int a[][],int k)
    {
        int  i,j;
        for ( i = 0; i < a.length; i++) {
            for (j = 0; j <a.length ; j++) {
                if(a[i][j]==k)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int max(int a[][])
    {
        int max=a[0][0];
        int  i,j;
        for ( i = 0; i < a.length; i++) {
            for (j = 0; j <a.length ; j++) {
                if(max<a[i][j])
                {
                    max=a[i][j];
                }
            }
        }
        return max;
    }

}