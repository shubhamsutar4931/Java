public class Atriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<=n-i+2;j++)
            {
                System.out.print(" ");
            }
            for (int j=i;j>0;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
