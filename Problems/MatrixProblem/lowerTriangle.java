public class lowerTriangle {
    public static void main(String[] arg)
    {
        int row1,col1,row2,col2;
        int a[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };

        row1=a.length;
        col1=a[0].length;
        if(row1!=col1)
        {
            System.out.println("matrix are not equal");
        }
        else
        {
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
//                    for lower triangle
//                    if(j>i)
                    //for upper triangle
                    if(j<i)
                    {

                        System.out.print("0 ");
                    }
                    else
                    {
                        System.out.print(a[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
