public class largest {
    public static void main(String[] args) {
        int max=0;
        int arr[]={12,13,28,24,25};
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
