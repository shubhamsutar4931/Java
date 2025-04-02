public class largestEle {
    public static void main(String[] args) {
//        int max=0;
        int arr[]={10,11,12,13,11,15,9};
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
//            if(arr[i]>max)
//            {
//                max=arr[i];
//            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
//        System.out.println(max);
        System.out.println(min);
    }
}
