public class evenOddNo {
    public static void main(String[] arg)
    {
        int row1,col1,countEven=0,countOdd=0;
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
                    if(a[i][j]%2==0)
                    {
                        countEven++;
                    }
                    else
                    {
                        countOdd++;
                    }
                }
            }
            System.out.println("frequency of even no:"+countEven);
            System.out.println("frequency of odd no:"+countOdd);
        }
    }
}
