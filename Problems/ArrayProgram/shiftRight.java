public class shiftRight {
    public static void main(String[] arg) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int n = 3;
        System.out.println("orginal array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            int last;
            last = arr[arr.length-1];

            for (int j = arr.length-1; j >0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0]=last;
        }
        System.out.println();
        System.out.println("right shifted");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
