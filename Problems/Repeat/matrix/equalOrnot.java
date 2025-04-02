public class equalOrnot {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        int r1=a.length;
        int c1=a[0].length;
        int r2=a.length;
        int c2=a[0].length;
        boolean flag=true;
        if(r1!=r2||c1!=c2)
        {
            System.out.println("not equal");
        }
        else
        {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][j] != b[i][j])
                    {
                        flag=false;
                        break;
                    }
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
