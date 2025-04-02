public class Main {
    public static void main(String[] arg)
    {
//        RightAlphabaticPattern1(65);
//        RepeatingPattern2(65);
//        KshapePattern3();
        TriangleCharacterPattern4(65);
    }
//    static void RightAlphabaticPattern1(int alphabet)
//    {
//        for(int i=0;i<=6;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print((char)(alphabet+j)+" ");
//
//            System.out.println();
//        }
//    }

//    static void RepeatingPattern2(int alphabet) {
//        for (int i = 0; i <= 6; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (alphabet + i) + " ");
//            }
//                System.out.println();
//            }
//        }


//    static void KshapePattern3()
//    {
//        for (int i = 8; i >0; i--)
//        {
//            int alphabet=65;
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (alphabet + j) + " ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i <=8; i++)
//        {
//            int alphabet=65;
//            for (int j = 0; j <= i; j++) {
//                System.out.print((char) (alphabet + j) + " ");
//            }
//            System.out.println();
//        }
//    }

    static void TriangleCharacterPattern4(int alphabet) {
        for (int i = 0; i <= 6; i++) {
            for(int j=6;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
