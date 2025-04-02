public class gcd {
    public static void main(String[] arg)
    {
        int x=12;
        int y=8;
        int gcd=1;
        for (int i = 2; i <=x&&i<=y ; i++) {
            if(x%i==0&&y%i==0)
            {
                gcd=i;
            }
        }
        System.out.print(gcd);
    }
}
