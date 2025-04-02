package linear;

public class linearSearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,12,35};
        int key=40;
        System.out.println("key at index:"+linearS(arr,key));
    }
    public static int linearS(int a[],int k)
    {
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k)
            {
                return i;
            }
        }
        return -1;
    }
}
