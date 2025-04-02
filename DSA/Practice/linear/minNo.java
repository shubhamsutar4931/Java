package linear;

public class minNo {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,12,9,35};
        System.out.println("minimum no is:"+minimum(arr));
    }

    public static String minimum(int[] a) {
        int min=a[0];
        int i;
        for ( i = 0; i < a.length; i++) {
            if(min>a[i])
            {
                 min=a[i];
                 break;
            }
        }
        return min+"at index"+i;
    }
}
