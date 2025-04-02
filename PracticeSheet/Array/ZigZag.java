import java.util.Arrays;

public class ZigZag {

        // Function to convert the array into Zig-Zag fashion
        static void zigZag(int[] arr) {
            int n = arr.length;

            // Traverse all elements of the array
            for (int i = 0; i < n - 1; i++) {
                // If 'i' is even, arr[i] should be less than arr[i+1]
                if (i % 2 == 0) {
                    if (arr[i] > arr[i + 1]) {
                        // Swap arr[i] and arr[i+1]
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
                // If 'i' is odd, arr[i] should be greater than arr[i+1]
                else {
                    if (arr[i] < arr[i + 1]) {
                        // Swap arr[i] and arr[i+1]
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }

        public static void main(String[] args) {
            int[] arr = {4, 3, 7, 8, 6, 2, 1};

            // Convert the array to Zig-Zag fashion
            zigZag(arr);

            // Print the modified array
            System.out.println("Zig-Zag array: " + Arrays.toString(arr));
        }
}
