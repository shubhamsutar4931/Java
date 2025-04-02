import java.util.Arrays;

public class binarySearchPreDefined {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int key = 60;
        int last = arr.length - 1;
        int result = Arrays.binarySearch(arr, 0, last, key);
        if (result == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element found at index:" + result);
        }
    }
}
