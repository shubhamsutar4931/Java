public class binarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int key=50;
        int last=arr.length-1;
        int result=binaryS(arr,0,last,key);
        if(result==-1)
        {
            System.out.println("not found");
        }
        else {
            System.out.println("found at index:"+result);
        }

    }
    static int binaryS(int a[],int start,int last,int key)
    {
        int mid=start+(last-start)/2;
        if(a[mid]==key)
        {
            return mid;
        }
        else
        {
            if(a[mid]>key)
            {
                return binaryS(a,0,mid-1,key);
            }
            if(a[mid]<key)
            {
                return binaryS(a,mid+1,last,key);
            }
        }
        return -1;
    }
}
