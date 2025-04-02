public class ElementWithLeftSmallerRightGreater {
        public static void main(String[] args) {
            int arr[] = {4, 2, 5, 7, 6, 8, 10};
            int result = findElement(arr);
            if (result != -1) {
                System.out.println("Element is: " + result);
            } else {
                System.out.println("No such element found.");
            }
        }

        // Function to find the element with left smaller and right greater
        static int findElement(int arr[]) {
            int n = arr.length;

            // If there are less than 3 elements, no such element is possible
            if (n < 3) {
                return -1;
            }

            // Create two auxiliary arrays
            int[] leftMax = new int[n];
            int[] rightMin = new int[n];

            // Initialize leftMax and rightMin
            leftMax[0] = Integer.MIN_VALUE;
            rightMin[n - 1] = Integer.MAX_VALUE;

            // Fill leftMax[] array
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
            }

            // Fill rightMin[] array
            for (int i = n - 2; i >= 0; i--) {
                rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
            }

            // Traverse the array and find the element where leftMax[i] < arr[i] < rightMin[i]
            for (int i = 0; i < n; i++) {
                if (leftMax[i] < arr[i] && arr[i] < rightMin[i]) {
                    return arr[i];
                }
            }

            // If no such element is found, return -1
            return -1;
        }

}
