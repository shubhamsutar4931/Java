public class Srighttri {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            //space between
            for(int j=2*(n-i);j>=0;j--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
