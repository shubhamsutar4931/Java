public class selectionSort {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        System.out.println("before sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        selectionsort(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void selectionsort(int arr[])
    {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int index=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }
            int smallest=arr[index];
            arr[index]=arr[i];
            arr[i]=smallest;
        }
    }
}
