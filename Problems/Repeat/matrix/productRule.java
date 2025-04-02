public class productRule {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r1=a.length;
        int c1=a[0].length;
        int r2=a.length;
        int c2=a[0].length;
        int prod[][]=new int[r1][c2];
        if(r1!=r2||c1!=c2)
        {
            System.out.println("not equal");
        }
        else
        {

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                   for (int k=0;k<r2;k++)
                   {
                       prod[i][j]=prod[i][j]+a[i][k]*b[k][j];
                    }
                }
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    }
}
