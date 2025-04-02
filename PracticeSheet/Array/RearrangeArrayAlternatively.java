import java.util.Arrays;

public class RearrangeArrayAlternatively {

    static int[] rearrangeArray(int arr[] ) {
        int temp[] = new int[arr.length];
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                temp[i] = arr[right--];
            } else {
                temp[i] = arr[left++];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rearrangeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
