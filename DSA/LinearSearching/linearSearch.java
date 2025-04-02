public class linearSearch {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{11,12,13,15,46,54,25,78};
        int key=46;
        System.out.println(key+" is found at index:"+linearsearch(arr,key));
    }
    public  static int linearsearch(int[] a, int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
}
