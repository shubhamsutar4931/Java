public class identityMatrix {
    public static void main(String[] arg)
    {
        int row,col;
        boolean flag=true;
        int arr[][] = {
                {2,0,0},
                {0,1,0},
                {0,0,1}
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
                if(i==j && arr[i][j]!=1)
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
            System.out.println("matrix is identity");
        }
        else
        {
            System.out.println("matrix is not identity");
        }
    }
}
