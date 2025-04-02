public class transposeOfMareix {
    public static void main(String[] arg)
    {
        int row,col;
        int arr[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        row=arr.length;
        col=arr[0].length;
        int t[][]=new int[row][col];
        System.out.println("Original matrix:");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<col;i++)
        {
           for (int j=0;j<row;j++)
           {
               t[i][j]=arr[j][i];
           }
        }
        System.out.println("Transpose of matrix:");
        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
