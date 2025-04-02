public class larger {
    public static void main(String[] args) {
        int arr[]={12,23,10,11};
        int temp=0;
        int total= arr.length;
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<total;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr[1]);

    }

}
