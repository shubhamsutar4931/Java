public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        System.out.println("before sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        bubblesort(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubblesort(int arr[])
    {
        int n= arr.length;
        int temp=0;
        for(int i=0;i< n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
