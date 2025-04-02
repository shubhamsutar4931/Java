public class insertion {
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        System.out.println("before sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        insertionsort(arr);
        System.out.println();
        System.out.println("After sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void insertionsort(int arr[])
    {
        int n= arr.length;
        for (int j = 1; j < n; j++) {
            int key=arr[j];
            int i=j-1;
            while ((i>-1)&&arr[i]>key)
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }
}
