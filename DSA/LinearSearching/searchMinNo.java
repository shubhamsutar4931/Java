public class searchMinNo {
    public static void main(String[] args) {
        int min = 0;
        int arr[]={112,213,124,453,577,34,576,775};
        System.out.println(minNo(arr,min));
    }
    public static int minNo(int[] arr, int min)
    {
        min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
}
