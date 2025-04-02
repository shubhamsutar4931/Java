public class sparseMatrix {
    public static void main(String[] arg)
    {
        int row,col;
        boolean flag=true;
        int arr[][] = {
                {4,0,0},
                {0,3,0},
                {0,0,7}
        };
        row=arr.length;
        col=arr[0].length;
        if(row!=col)
        {
            System.out.println("matrix is not square");
        }

        for(int i=0;i<col;i++)
        {
            for (int j=0;j<row;j++)
            {
                if(i==j && arr[i][j]==0)
                {
                    flag=false;
                    break;
                }
                if(i!=j && arr[i][j]!=0)
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag)
        {
            System.out.println("matrix is sparse");
        }
        else
        {
            System.out.println("matrix is not sparse");
        }
    }
}
