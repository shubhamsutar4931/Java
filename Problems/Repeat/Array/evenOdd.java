public class evenOdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("even:");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.println("odd:");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
