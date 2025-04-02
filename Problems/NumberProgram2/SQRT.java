public class SQRT {
    public static void main(String[] arg)
    {
        int n=100;
        System.out.println("sqrt of 100 is:"+squareroot(n));
    }
    public static double squareroot(int num)
    {
        double t;
        double sqrt=num/2;
        do {
            t=sqrt;
            sqrt=(t+(num/t))/2;
        }while((t-sqrt)!=0);
        return sqrt;
    }

}
