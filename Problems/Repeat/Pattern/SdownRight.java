public class SdownRight {
    public static void main(String[] args) {
//        Downward Triangle Star Pattern
//        int n=4;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=n-i;j>0;j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        Reverse Pyramid Star Pattern
//        int n=4;
//        for(int i=0;i<n;i++)
//        {
//            for (int j=0;j<=i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=n-i;j>0;j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();

//        Right Pascal's Triangle
//        int n=5;
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<n;i++)
//        {
//            for(int j=n-i;j>0;j--)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Triangle Star Pattern
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++)
            {
                if(j==1 || i == n || j==(2*i-1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
