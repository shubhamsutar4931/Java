public class Aright {
    public static void main(String[] args) {
        int k=1,n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
