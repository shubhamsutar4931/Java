import java.util.Scanner;

public class leftShift {
    public static void main(String[] arg)
    {
        int arr[]=new int[]{1,2,3,4,5};
        int n=3;
        System.out.println("orginal array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < n ; i++) {
            int first=arr[0],j;
            for ( j = 0; j < arr.length-1; j++) {
                arr[j]=arr[j+1];
            }
            arr[j]=first;
        }
        System.out.println();
        System.out.println("left shifted");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


        //DSA
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt(); // number of elements
//        System.out.println();
//        int d = scanner.nextInt(); // number of rotations
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scanner.nextInt();
//        }
//
//        for(int i=0;i<d;i++)
//        {
//            int first,j;
//            first=arr[0];
//            for(j=0;j<arr.length-1;j++)
//            {
//                arr[j]=arr[j+1];
//            }
//            arr[j]=first;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        scanner.close();
    }
}
