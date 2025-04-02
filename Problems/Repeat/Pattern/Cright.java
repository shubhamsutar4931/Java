public class Cright {
    public static void main(String[] args) {

//        int alphabet=65;
//        for(int i=0;i<6;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print((char)(alphabet+j)+" ");
//            }
//            System.out.println();
//        }
//        int alphabet=65;
//        for(int i=5;i>1;i--)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print((char)(alphabet+j)+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<6;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print((char)(alphabet+j)+" ");
//            }
//            System.out.println();
//        }

        int n=65;
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=(5-i)+1;j++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++)
            {
                System.out.print((char) (n+j)+" ");
            }
            System.out.println();
        }

    }
}
