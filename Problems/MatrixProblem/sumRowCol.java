public class sumRowCol {
    public static void main(String[] arg)
    {
        int sumrow;
        int sumCol;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i< 3;i++)
        {
            sumrow=0;
            for(int j=0;j< 3;j++)
            {
                sumrow=sumrow+arr[i][j];
            }
            System.out.println("sum of"+(i+1)+"row:"+sumrow);
        }

        for(int i=0;i< 3;i++)
        {
            sumCol=0;
            for(int j=0;j< 3;j++)
            {
                sumCol=sumCol+arr[j][i];
            }
            System.out.println("sum of"+(i+1)+"colum:"+sumCol);
        }
    }
}
