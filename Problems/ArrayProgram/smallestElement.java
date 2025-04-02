public class smallestElement {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{18,12,13,14,20};
        int min=arr[0];
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Smallest element of array:");
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
