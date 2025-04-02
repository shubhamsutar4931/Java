public class leftShift {
    public static void main(String[] args) {
        int n=3;
        int first;
        int arr[]={1,2,3,4};
        for(int i=0;i<n;i++)
        {
            int j;
            first=arr[0];
            for( j=0;j< arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
