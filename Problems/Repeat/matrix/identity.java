public class identity {
    public static void main(String[] args) {
        int a[][]={{1,0,0},{0,1,0},{0,0,1}};
        int r1=a.length;
        int c1=a[0].length;
        boolean flag=true;
         for (int i = 0; i < a.length; i++)
         {
                for (int j = 0; j < a.length; j++)
                {
                    if (a[i][j]!=0&&i!=j)
                    {
                        flag=false;
                        break;
                    }
                    if (a[i][j]!=1&&i==j)
                    {
                        flag=false;
                        break;
                    }
                }
         }

        if(flag)
        {
            System.out.println("is equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }
}
