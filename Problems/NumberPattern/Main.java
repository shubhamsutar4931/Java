public class Main {
    public static void main(String[] arg)
    {
//        NumberPattern1(5);
//        NumberPattern2(5);
//        NumberPattern4(5);
//        NumberPattern5(5);
//        NumberPattern6(5);
//        NumberPattern7(5);
//        NumberPattern9(5);
        NumberPattern21(3);
    }

//    static void NumberPattern1(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void NumberPattern2(int n)
//    {
//        int k=1;
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(k++ +" ");
//
//
//            }
//            System.out.println();
//        }
//    }

//    static void NumberPattern4(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=i;j>=1;j--)
//            {
//                System.out.print(j);
//            }
//            for(int j=2;j<=i;j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }


//    static void NumberPattern5(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void NumberPattern6(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n;j>=(n-i)+1;j--)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void NumberPattern7(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=i;j>=1;j--)
//            {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void NumberPattern9(int n)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                if(j%2==0)
//                {
//                    System.out.print(0);
//                }
//                else
//                {
//                    System.out.print(1);
//                }
//            }
//            System.out.println();
//        }
//    }

    static void NumberPattern21(int n)
    {
        int original=n;
        n=2*n;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                int ateveryIndex=original-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(ateveryIndex+" ");
            }
            System.out.println();
        }
    }
}
