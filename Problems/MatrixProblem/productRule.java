public class productRule {
    public static void main(String[] arg)
    {
        int row1,col1,row2,col2;
        int a[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        int b[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };

        row1=a.length;
        col1=a[0].length;
        row2=b.length;
        col2=b[0].length;
        if(row1!=col2)
        {
            System.out.println("matrix are not equal");
        }
        else
        {
            int prod[][]=new int[row2][col2];
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col2;j++)
                {

                    for(int k=0;k<row2;k++)
                    {
                        prod[i][j]=prod[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(prod[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}
