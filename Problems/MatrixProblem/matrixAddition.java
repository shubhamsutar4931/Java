import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] arg)
    {
                Scanner scanner = new Scanner(System.in);

                // Create a 2D array (matrix)
                int[][] arr = new int[3][3];

        // Input elements into the 2D matrix
                System.out.println("Enter the elements of the matrix:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Element at [" + i + "][" + j + "]: ");
                        arr[i][j] = scanner.nextInt();
                    }
                }

                // Display the 2D matrix
                System.out.println("The matrix is:");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
        int[][] arr1 = new int[3][3];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        //sum
//        int arr2[][]=new int[3][3];
//        System.out.println("The matrix sum is:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr2[i][j]=arr[i][j]+arr1[i][j];
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//        }


        //substract
//        int arr2[][]=new int[3][3];
//        System.out.println("The matrix sum is:");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr2[i][j]=arr[i][j]-arr1[i][j];
//                System.out.print(arr2[i][j] + " ");
//            }
//            System.out.println();
//        }


        //multiplication
        int arr2[][]=new int[3][3];
        System.out.println("The matrix sum is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j]=arr[i][j]*arr1[i][j];
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
                scanner.close();
    }
}
