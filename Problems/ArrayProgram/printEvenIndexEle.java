public class printEvenIndexEle {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{1,2,3,4,2,1};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Even index element of array:");
        for(int i=1;i<arr.length;i=i+2)
        {

                System.out.print(arr[i]+" ");
        }
    }
}
