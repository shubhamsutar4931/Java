import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,3,5,6};
        int arr2[]={2,4,7,8};
        int n1= arr1.length;
        int n2= arr2.length;
        int marge[]=new int[n1+n2];

        int i=0,j=0;
        for (int k = 0; k < marge.length; k++)
        {
           if(i<n1&&(j>=n2||arr1[i]<arr2[j]))
           {
               marge[k]=arr1[i];
               i++;
           }
           else
           {
               marge[k]=arr2[j];
               j++;
           }
        }
        System.out.println(Arrays.toString(marge));
    }
}
