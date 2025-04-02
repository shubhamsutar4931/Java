public class binarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int key=60;
        int last=arr.length-1;
        int result =binarysearch(arr,0,last,key);
        if(result==-1)
        {
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at index:" + result);
        }
    }
    static int binarysearch(int[] arr, int first, int last, int key)
    {
        if(last>=first)
        {
            int mid=first+(last-first)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(arr[mid]>key)
            {
                return binarysearch(arr,first,mid-1,key);
            }
            else if(arr[mid]<key)
            {
                return binarysearch(arr,mid+1,last,key);
            }
        }
        return -1;
    }
}
