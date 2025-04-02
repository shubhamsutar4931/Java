public class largestElement {
    public static void main(String[] arg)
    {
        int max=0;
        int arr[]=new int[]{1,2,3,4,2,1};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Largest element of array:");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
