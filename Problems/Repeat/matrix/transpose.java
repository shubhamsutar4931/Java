public class transpose {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int t[][]=new int[3][3];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                t[i][j]=a[j][i];
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
