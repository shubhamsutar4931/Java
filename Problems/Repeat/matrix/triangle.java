public class triangle {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                //lower triangle
//               if(j>i)
//               {
//                   System.out.print("0 ");
//               }
//               else {
//                   System.out.print(a[i][j]+" ");
//               }

                //upper triangle
                if(j<i)
                {
                    System.out.print("0 ");
                }
                else {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
