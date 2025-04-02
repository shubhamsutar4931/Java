public class sumOfRowCol {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r1=a.length;
        int c1=a[0].length;
        int r2=a.length;
        int c2=a[0].length;


        for (int i = 0;i<a.length ; i++)
        {
            int sumR=0;
            for (int j = 0; j < a.length; j++)
            {
                sumR=sumR+a[i][j];
            }
            System.out.println(sumR);
        }

        for (int i = 0;i<a.length ; i++)
        {
            int sumC=0;
            for (int j = 0; j < a.length; j++)
            {
                sumC=sumC+a[j][i];
            }
            System.out.println(sumC);
        }

    }
}
