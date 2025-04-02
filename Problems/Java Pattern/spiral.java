public class spiral {
    public static void main(String[] args) {
        int n=3;
        int size = 2 * n - 1;
//inner loop
        for(int i = 1; i <= size; i++)
        {
//outer loop
            for(int j = 1; j <= size; j++)
            {
//calculates and prints the values for pattern
                System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");
            }
            System.out.println();
        }
    }
}
