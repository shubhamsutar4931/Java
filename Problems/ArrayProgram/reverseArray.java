public class reverseArray {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{1,2,3,4,2,1};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reverse array:");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
